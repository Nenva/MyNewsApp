package mgm.u.mynewsapp.models


import mgm.u.mynewsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)