package com.example.application4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridPhoneAdapter(val listPhones: ArrayList<Phone>) : RecyclerView.Adapter<GridPhoneAdapter.GridViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.phone_img)
        var phoneName: TextView = itemView.findViewById(R.id.phone_name)
        var phoneDetails: TextView = itemView.findViewById(R.id.phone_details)
        var phonePrice: TextView = itemView.findViewById(R.id.phone_price)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_phone, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPhones.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val phone = listPhones[position]

        Glide.with(holder.itemView.context)
            .load(listPhones[position].photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.phoneName.text = phone.name
        holder.phoneDetails.text = phone.detail
        holder.phonePrice.text = "Rp. " + phone.price.toString()

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPhones[holder.adapterPosition])
        }
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Phone)
    }
}