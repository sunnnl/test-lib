package com.sunnni.testlibproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sunnni.testlib2.ToastClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastClass.makeToast(this, "정서니 바보 !")
    }
}