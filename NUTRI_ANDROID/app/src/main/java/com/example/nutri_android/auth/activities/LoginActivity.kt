package com.example.nutri_android.auth.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.nutri_android.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {

    private lateinit var nombre: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
    }

    override fun onResume() {
        super.onResume()
        initSplash()
    }

    fun initSplash(){
        splash_fragment.view!!.visibility = View.VISIBLE
        GlobalScope.launch(context = Dispatchers.Main) {
            delay(5000)
            splash_fragment.view!!.visibility = View.GONE
        }
    }
}
