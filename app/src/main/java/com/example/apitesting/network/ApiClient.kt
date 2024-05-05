package com.example.apitesting.network

import com.example.apitesting.model.remote.PersonService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://randomuser.me/"

    fun create(): PersonService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(PersonService::class.java)
    }
}
