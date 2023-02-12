//package com.kotlin.domains.movies.controllers
//
//import com.kotlin.domains.movies.dtos.PersonDTO
//import com.kotlin.domains.movies.services.PersonServiceImplementation
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestBody
//import org.springframework.web.bind.annotation.RestController
//
//@RestController
//class PersonController(
//    private val personServiceImplementation: PersonServiceImplementation
//) {
//    @PostMapping("/persons")
//    fun createPerson(
//        @RequestBody personDTO: PersonDTO
//    ): PersonDTO {
//        return personServiceImplementation.createPerson(personDTO);
//    }
//
//}