package com.example.apitesting.ui.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.apitesting.model.data.Person

@Composable
fun PersonCard(person: Person) {
    Card {
        Text(text = "Name: ${person.name.first} ${person.name.last}")
    }
}