package com.sunnni.testlib2

import android.content.Context
import android.widget.Toast

class ToastClass {
    companion object{
        fun makeToast(ctx: Context, message: String) = Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show()
    }
}