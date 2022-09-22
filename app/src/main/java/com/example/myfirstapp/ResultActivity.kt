package com.example.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    companion object{
        const val INTENT_NAME= "INTENT_NAME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { onBackPressed() }
        getAndShowName()
    }

    fun getAndShowName() {
        val bundle = intent.extras
        val name = bundle?.get(INTENT_NAME)
        binding.tvSayHello.text = "hola $name"
    }
}