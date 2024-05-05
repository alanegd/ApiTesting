package com.example.apitesting.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.example.apitesting.model.data.Person
import com.example.apitesting.repositories.PersonRepository
import com.example.apitesting.ui.components.PersonCard
import kotlinx.coroutines.launch

@Composable
fun PeopleScreen() {
    val coroutineScope = rememberCoroutineScope()
    val personRepository = remember { PersonRepository() }
    val people = remember { mutableStateOf(emptyList<Person>()) }

    Scaffold { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues).fillMaxSize()) {
            Button(onClick = {
                coroutineScope.launch {
                    personRepository.getPersons(5) { response ->
                        people.value = response
                    }
                }
            }) {
                Text("Fetch Persons")
            }

            LazyColumn {
                items(people.value.size) { index ->
                    PersonCard(person = people.value[index])
                }
            }

        }
    }
}
