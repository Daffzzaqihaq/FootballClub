package com.daffzzaqihaq.footballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.list_club.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val namaClub = intent.getStringExtra("namaClub")
        val detailClub = intent.getStringExtra("detailClub")
        val gambarClub = intent.getIntExtra("gamabarClub",0)

        txtNamaClubDetail.text= namaClub
        txtDetail.text=detailClub
        Glide.with(this).load(gambarClub).into(imgLogoClub)
    }
}
