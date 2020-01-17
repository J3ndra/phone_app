package com.example.application4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPhoneAdapter(private val listPhone: ArrayList<Phone>) : RecyclerView.Adapter<ListPhoneAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_phone, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPhone.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val phone = listPhone[position]

        Glide.with(holder.itemView.context)
            .load(phone.photo)
            .apply(RequestOptions().override(80,65))
            .into(holder.imgPhoto)

        holder.tvName.text = phone.name
        holder.tvDetail.text = phone.detail
        holder.tvPrice.text = "Rp. " + phone.price.toString()

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPhone[holder.adapterPosition])
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Phone)
    }
}