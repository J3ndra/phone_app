package com.example.application4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvPhones: RecyclerView
    private var list: ArrayList<Phone> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPhones = findViewById(R.id.rv_phone)
        rvPhones.setHasFixedSize(true)

        list.addAll(PhoneData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPhones.layoutManager = LinearLayoutManager(this)
        val listPhoneAdapter = ListPhoneAdapter(list)
        rvPhones.adapter = listPhoneAdapter

        listPhoneAdapter.setOnItemClickCallback(object : ListPhoneAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Phone) {
                showSelectedPhone(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvPhones.layoutManager = GridLayoutManager(this, 2)
        val gridPhoneAdapter = GridPhoneAdapter(list)
        rvPhones.adapter = gridPhoneAdapter

        gridPhoneAdapter.setOnItemClickCallback(object : GridPhoneAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Phone) {
                showSelectedPhone(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }

            R.id.action_grid -> {
                showRecyclerGrid()
            }
        }
    }

    private fun showSelectedPhone(phone: Phone) {
        Toast.makeText(this, "Kamu memilih " + phone.name, Toast.LENGTH_SHORT).show()

        val moveDataPhone = Intent(this@MainActivity, DetailActivity::class.java)
        moveDataPhone.putExtra(DetailActivity.DETAIL_NAME, phone.name)
        moveDataPhone.putExtra(DetailActivity.DETAIL_PHOTO, phone.photo)
        moveDataPhone.putExtra(DetailActivity.DETAIL_PRICE, phone.price.toString())
        moveDataPhone.putExtra(DetailActivity.DETAIL, phone.detail)

        startActivity(moveDataPhone)
    }

}
