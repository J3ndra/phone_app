package com.example.application4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val DETAIL_PHOTO = "photo"
        const val DETAIL_NAME = "name"
        const val DETAIL_PRICE = "price"
        const val DETAIL = "detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgPhone: ImageView = findViewById(R.id.img_detail_photo)

        val detail_img = intent.getIntExtra(DETAIL_PHOTO,0)
        Glide.with(this)
            .load(detail_img)
            .apply(RequestOptions().override(300, 500))
            .into(imgPhone)

        val phoneName: TextView = findViewById(R.id.detail_phone)
        val detail_name = intent.getStringExtra(DETAIL_NAME)
        phoneName.text = detail_name

        val phonePrice: TextView = findViewById(R.id.detail_price)
        val detail_price = intent.getStringExtra(DETAIL_PRICE)
        phonePrice.text = "Rp. " + detail_price

        val phoneDetail: TextView = findViewById(R.id.detail_content)
        val detail_content = intent.getStringExtra(DETAIL)
        phoneDetail.text = detail_content

        supportActionBar!!.title = detail_name
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
