package rafaelacs.com.br.newsapp.models

import com.google.gson.annotations.SerializedName
import rafaelacs.com.br.newsapp.models.Article

data class NewsResponse(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("articles")
    val articles: MutableList<Article>
)