package com.android.kuliner.jawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.kuliner.R

class JawaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawa)
    }

    fun gudeg(view: View) {
        startActivity(Intent(this, GudegActivity::class.java))
    }

    fun rujak(view: View) {
        startActivity(Intent(this, RujakActivity::class.java))
    }

    fun tahu(view: View) {
        startActivity(Intent(this, TahuActivity::class.java))
    }
}
