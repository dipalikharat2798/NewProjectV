package com.vback.vback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vback.vback.databinding.ActivityDashboardBinding

class DashBoardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}