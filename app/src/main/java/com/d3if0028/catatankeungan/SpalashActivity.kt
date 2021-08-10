package com.d3if0028.catatankeungan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SpalashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalash)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,Home::class.java))
        },5000)
    }
}
