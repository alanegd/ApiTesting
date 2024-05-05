package com.example.apitesting.repositories

import com.example.apitesting.model.data.PersonResponse
import com.example.apitesting.model.remote.PersonService

class PersonRepository(private val personService: PersonService) {
    suspend fun getPersons(numberOfPersons: Int): PersonResponse {
        return personService.getPersons(numberOfPersons)
    }
}