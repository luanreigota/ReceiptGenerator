package com.receiptgenerator.usecase

import com.receiptgenerator.entity.Emissor
import com.receiptgenerator.entity.TipoDocumentoEnum
import com.receiptgenerator.input.CreateEmissorRequest
import com.receiptgenerator.input.CreateEmissorResponse
import com.receiptgenerator.input.CreateEmissorUseCase
import com.receiptgenerator.output.EmissorGateway
import org.springframework.stereotype.Service

@Service
class CreateEmissorService(
    private val emissorGateway: EmissorGateway,
) : CreateEmissorUseCase {
    override fun execute(request: CreateEmissorRequest): CreateEmissorResponse {
        val emissor = Emissor(
            id = 0,
            nomeCompleto = request.nomeCompleto,
            documento = request.documento,
            tipoDocumento = TipoDocumentoEnum.valueOf(request.tipoDocumento),
        )
        val saved = emissorGateway.save(emissor)
        return CreateEmissorResponse(
            id = saved.id,
            nomeCompleto = saved.nomeCompleto,
            documento = saved.documento,
            tipoDocumento = saved.tipoDocumento.name,
        )
    }
}

