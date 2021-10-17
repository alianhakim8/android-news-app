package id.alian.news_app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.alian.news_app.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.bottomNavigationView.setupWithNavController


    }
}