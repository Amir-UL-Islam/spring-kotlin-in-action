package com.kotlin.domains.movies.mappers

interface PersonMapper<D, E> {
    fun toDTO(entity: E): D
    fun toEntity(dto: D): E
}