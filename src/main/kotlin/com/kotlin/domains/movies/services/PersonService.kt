package com.kotlin.domains.movies.services

import com.kotlin.domains.movies.dtos.PersonDTO

interface PersonService {
    fun createPerson(personDTO: PersonDTO): PersonDTO
}