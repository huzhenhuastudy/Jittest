package com.example.jittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.udesk.UdeskUtil
import kotlinx.android.synthetic.main.activity_main.*
import udesk.core.utils.UdeskUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_button.text = UdeskUtils.getAppName(this)
        UdeskUtil.loadImage(this,img,"")
    }
}
