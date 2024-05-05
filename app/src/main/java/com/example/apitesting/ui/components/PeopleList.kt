package com.example.apitesting.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.example.apitesting.model.data.Person

@Composable
fun PeopleList(people: MutableState<List<Person>>) {
    LazyColumn {
        items(people.value.size) { index ->
            PersonCard(person = people.value[index])
        }
    }
}