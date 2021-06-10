package com.junio.coroutines.ui.main

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class MainRepository {

    fun getMovies(callback: (movies: List<Movie>) -> Unit) {
        Thread {
            Thread.sleep(3000)
            callback.invoke(
                listOf(
                    Movie(1, "A"),
                    Movie(2, "B"),
                    Movie(3, "C"),
                    Movie(4, "D")
                )
            )
        }.start()
    }

    suspend fun getMoviesCoroutines(): List<Movie> {
        return withContext(Dispatchers.Default) {
            delay(3000)
            listOf(
                Movie(1, "A"),
                Movie(2, "B"),
                Movie(3, "C"),
                Movie(4, "D")
            )
        }
    }
}