package rafaelacs.com.br.newsapp.repository

import rafaelacs.com.br.newsapp.api.RetrofitInstance
import rafaelacs.com.br.newsapp.db.ArticleDatabase
import rafaelacs.com.br.newsapp.models.Article

class NewsRepository(
        val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
            RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
            RetrofitInstance.api.getSearchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

}