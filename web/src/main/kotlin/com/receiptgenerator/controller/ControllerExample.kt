package com.receiptgenerator.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ControllerExample {

    @GetMapping("/hello")
    fun helloWorld(): ResponseEntity<String>{
        return ResponseEntity("hello", HttpStatus.OK)
    }

}