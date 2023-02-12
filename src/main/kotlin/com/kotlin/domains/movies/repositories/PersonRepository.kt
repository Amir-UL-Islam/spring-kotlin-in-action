package com.kotlin.domains.movies.repositories

import com.kotlin.domains.movies.entitis.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<Person, Long>