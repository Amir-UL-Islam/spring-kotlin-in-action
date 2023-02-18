package com.kotlin.domains.movies.controllers

import com.kotlin.domains.movies.dtos.PersonDTO
import com.kotlin.domains.movies.services.PersonServiceImplementation
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(
    private val personServiceImplementation: PersonServiceImplementation
) {
    @PostMapping("/persons")
    fun createPerson(
        @RequestBody personDTO: PersonDTO
    ): ResponseEntity<out Any> {
        return try {
            ResponseEntity(personServiceImplementation.createPerson(personDTO), HttpStatus.CREATED);
        } catch (exception: IllegalArgumentException) {
            ResponseEntity(exception.message ,HttpStatus.BAD_REQUEST)
        }
    }

    @GetMapping("/all_persons")
    fun getPersons(): List<PersonDTO> {
        return personServiceImplementation.getPerson();
    }

}