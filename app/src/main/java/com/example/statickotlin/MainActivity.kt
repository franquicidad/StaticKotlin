package com.example.statickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.statickotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        val myCompany= Users.company

        binding.text.text = myCompany


    }
}