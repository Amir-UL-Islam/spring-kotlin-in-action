package com.kotlin.domains.movies.mappers

import com.kotlin.domains.movies.dtos.PersonDTO
import com.kotlin.domains.movies.entitis.Person
import lombok.AllArgsConstructor
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service

class ImplementationOfPersonMapper: PersonMapper<PersonDTO, Person> {
    override fun toDTO(entity: Person): PersonDTO {
        return PersonDTO(
            entity.id,
            entity.name,
            entity.age,
            entity.address,
            entity.email
        )
    }

//    Taking the input from the user and converting it to an entity
    override fun toEntity(dto: PersonDTO): Person {
        return Person(
            dto.id,
            dto.name,
            dto.age,
            dto.address,
            dto.email
        )
    }
}