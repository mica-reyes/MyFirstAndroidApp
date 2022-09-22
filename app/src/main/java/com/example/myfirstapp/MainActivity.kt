package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowName.setOnClickListener { checkValue() }
    }

    fun checkValue() {
        if (binding.etName.text.isNotEmpty()) {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ResultActivity.INTENT_NAME, binding.etName.text)
            startActivity(intent)
        } else {
            showErrorName()
        }
    }

    fun showErrorName() {
        Toast.makeText(this, "completa el nombre", Toast.LENGTH_SHORT).show()
    }
}