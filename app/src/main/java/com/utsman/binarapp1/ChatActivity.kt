package com.utsman.binarapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        println("binar chat -------> oncreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)


        val stringAnu = intent.getStringExtra("key") // hard code
        val textView: TextView = findViewById(R.id.tv_chat)
        textView.text = stringAnu
    }

    override fun onStart() {
        super.onStart()
        println("binar chat -------> onstart")
    }

    override fun onResume() {
        super.onResume()
        println("binar chat -------> onresume")
    }

    override fun onPause() {
        super.onPause()
        println("binar chat -------> onpause")
    }

    override fun onStop() {
        super.onStop()
        println("binar chat -------> onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("binar chat -------> ondestroy")
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}