package com.receiptgenerator.repository.gateway

import com.receiptgenerator.entity.Emissor
import com.receiptgenerator.output.EmissorGateway
import com.receiptgenerator.repository.service.EmissorJpaRepository
import org.springframework.stereotype.Component

@Component
class EmissorGatewayImpl(
    private val repository: EmissorJpaRepository
) : EmissorGateway {
    override fun save(emissor: Emissor): Emissor = repository.save(emissor)
}

