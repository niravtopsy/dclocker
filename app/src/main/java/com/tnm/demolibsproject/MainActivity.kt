package com.tnm.demolibsproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tnm.demolibsproject.databinding.ActivityMainBinding
import com.tnm.tnmlibs.TNMProgress
import java.util.Timer
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    private var customProgress: TNMProgress = TNMProgress()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            customProgress.show(
                this@MainActivity, "https://picsum.photos/id/237/200/300", R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
            )
        }

        binding.button2.setOnClickListener {
            customProgress.hide()
        }

    }
}