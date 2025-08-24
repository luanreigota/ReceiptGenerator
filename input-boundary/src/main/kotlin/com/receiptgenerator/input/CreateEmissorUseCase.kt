package com.receiptgenerator.input

data class CreateEmissorRequest(
    val nomeCompleto: String,
    val documento: String,
    val tipoDocumento: String,
)

data class CreateEmissorResponse(
    val id: Long,
    val nomeCompleto: String,
    val documento: String,
    val tipoDocumento: String,
)

interface CreateEmissorUseCase {
    fun execute(request: CreateEmissorRequest): CreateEmissorResponse
}

