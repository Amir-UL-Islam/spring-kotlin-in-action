package com.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class SpringKotlinApplication {
	@GetMapping
	fun hello() = "Hello World!"

}
fun main(args: Array<String>) {
	runApplication<SpringKotlinApplication>(*args)
}
