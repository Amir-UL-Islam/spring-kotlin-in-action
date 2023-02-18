package com.kotlin.domains.movies.dtos

data class PersonDTO(
    val id: Int? = null,
    val name: String,
    val age: Int,
    val address: String,
    val email: String
)
