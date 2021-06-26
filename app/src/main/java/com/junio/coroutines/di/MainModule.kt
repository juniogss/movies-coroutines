package com.junio.coroutines.di

import com.junio.coroutines.ui.main.MainRepository
import com.junio.coroutines.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {

    factory {
        MainRepository()
    }

    viewModel { params ->
        MainViewModel(
            repository = get(),
            navController = get { params }
        )
    }
}