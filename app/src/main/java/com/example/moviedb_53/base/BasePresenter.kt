package com.example.moviedb_53.base

interface BasePresenter<T> {
    fun onStart()
    fun setView(view: T?)
}
