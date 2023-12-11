package com.sumeyra.intentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sumeyra.intentkotlin.databinding.ActivityMainBinding
import com.sumeyra.intentkotlin.databinding.ActivityNextBinding

class nextActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intentFromMain = intent //getIntent
        val name= intentFromMain.getStringExtra("userInput")
        binding.textView3.text = "Name: ${name}"
    }
}