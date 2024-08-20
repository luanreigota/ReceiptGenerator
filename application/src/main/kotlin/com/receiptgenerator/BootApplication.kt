package com.receiptgenerator

import org.springdoc.core.models.GroupedOpenApi
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan("com.receiptgenerator")
@EnableAutoConfiguration
class BootApplication

fun main(args: Array<String>) {
	runApplication<BootApplication>(*args)
}

@Bean
fun publicApi(): GroupedOpenApi {
	return GroupedOpenApi.builder()
		.group("public")
		.pathsToMatch("/**")
		.build()
}