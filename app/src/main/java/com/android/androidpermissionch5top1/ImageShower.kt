package com.android.androidpermissionch5top1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.androidpermissionch5top1.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class ImageShower : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoadImage.setOnClickListener {
            Glide.with(this)
                .load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.ivBinar)
        }


    }
}