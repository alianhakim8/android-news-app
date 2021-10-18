package id.alian.news_app.repository

import id.alian.news_app.api.RetrofitInstance
import id.alian.news_app.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)


}