package com.example.apitesting.factories

import com.example.apitesting.model.remote.PersonService

class PersonServiceFactory private constructor() {
    companion object {
        private var personService: PersonService? = null

        fun getPersonService(): PersonService {
            if (personService == null) {
                personService = RetrofitFactory.getRetrofit().create(PersonService::class.java)
            }
            return personService as PersonService
        }
    }
}