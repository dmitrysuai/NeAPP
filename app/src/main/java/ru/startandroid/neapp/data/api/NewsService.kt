package ru.startandroid.neapp.data.api

import retrofit2.http.GET
import retrofit2.http.Query
import ru.startandroid.neapp.utils.Constants.Companion.API_KEY

interface NewsService{
 @GET("/v2/top-headlines")
    suspend fun getEverything(
    @Query("q") string: String,
    @Query ("page") page: Int =1,
    @Query ("apiKey") apiKey: String = API_KEY

    )
    suspend fun getHeadLines (
    @Query ("country") countryCode: String="ru",
    @Query ("page") page: Int = 1,
    @Query ("apiKey")apiKey: String = API_KEY
)
}