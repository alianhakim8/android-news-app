package id.alian.news_app.ui

import androidx.lifecycle.ViewModel
import id.alian.news_app.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {

}