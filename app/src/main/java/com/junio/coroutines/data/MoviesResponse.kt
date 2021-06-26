package com.junio.coroutines.data

data class MoviesResponse(
    val dates: Dates,
    val page: Int,
    @Seria
    val movies: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)