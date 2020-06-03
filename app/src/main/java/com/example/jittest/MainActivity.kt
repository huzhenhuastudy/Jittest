package com.example.jittest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.bumptech.glide.Glide
import com.example.mylibrary2.LibActivity2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_button.setOnClickListener { startActivity(Intent(this, LibActivity2::class.java)) }
//        Glide.with(this).load("http://pro-cs.kefutoutiao.com/sdk_upload/tid3055/a05a85e9efc65f298b818206eeca8c94_upload.jpg?x-oss-process=image/auto-orient,1/resize,h_300,w_300").into(img)
    }
}
