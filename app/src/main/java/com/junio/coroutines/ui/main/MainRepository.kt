package com.junio.coroutines.ui.main

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
        }
    }

}