package com.receiptgenerator.controller

import com.receiptgenerator.input.CreateEmissorRequest
import com.receiptgenerator.input.CreateEmissorResponse
import com.receiptgenerator.input.CreateEmissorUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmissorController(
    private val createEmissorUseCase: CreateEmissorUseCase,
) {
    @PostMapping("/emissor")
    fun create(@RequestBody request: CreateEmissorRequest): ResponseEntity<CreateEmissorResponse> {
        val saved = createEmissorUseCase.execute(request)
        return ResponseEntity.status(HttpStatus.CREATED).body(saved)
    }
}

