package id.alian.news_app.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import id.alian.news_app.R
import id.alian.news_app.ui.NewsActivity
import id.alian.news_app.ui.NewsViewModel

class SaveNewsFragment : Fragment(R.layout.fragment_save_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

    }
}