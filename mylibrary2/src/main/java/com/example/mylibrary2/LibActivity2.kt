package com.example.mylibrary2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.LibActivity
import kotlinx.android.synthetic.main.activity_lib2.*
import udesk.core.utils.UdeskUtils

class LibActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib2)
        tv.text = UdeskUtils.getPackageInfo(this).packageName
        tv.setOnClickListener { startActivity(Intent(this,LibActivity::class.java)) }
    }
}
