package mgm.u.mynewsapp.models


import mgm.u.mynewsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)