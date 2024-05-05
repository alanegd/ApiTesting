package com.example.apitesting.model.remote

import com.example.apitesting.model.data.PersonResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PersonService {
    @GET("api/")
    suspend fun getPersons(@Query("results") results: Int): PersonResponse
}
