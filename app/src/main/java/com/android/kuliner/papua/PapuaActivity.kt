package com.android.kuliner.papua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.kuliner.R

class PapuaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_papua)
    }

    fun papeda(view: View) {
        startActivity(Intent(this, PapedaActivity::class.java))
    }
}
