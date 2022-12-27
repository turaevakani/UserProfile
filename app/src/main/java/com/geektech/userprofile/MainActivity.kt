package com.geektech.userprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.userprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.container, FirstFragment()).commit()
        }
    }
}