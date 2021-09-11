package com.redfox.bdaycard

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redfox.bdaycard.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAnim()
        touchAnim()
        binding.cardBtnWelcome.setOnClickListener {
            Intent(this,CardLayoutManager::class.java).also {
                startActivity(it)

            }
        }
    }

    fun setupAnim() {
        binding.animationView.speed=0.90F
        binding.animationView.setMinProgress(0.18F)
        binding.animationView.playAnimation()
    }

    fun touchAnim() {
        binding.animationView.setOnClickListener {
            binding.animationView.playAnimation()
        }
    }
}