package com.example.dukaanApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.dukaanApplication.databinding.ActivityMerchantLoginBinding

class MerchantLoginActivity : AppCompatActivity() {

    private lateinit var  _binding : ActivityMerchantLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMerchantLoginBinding.inflate(layoutInflater)
        setContentView(_binding.root)
    }



}