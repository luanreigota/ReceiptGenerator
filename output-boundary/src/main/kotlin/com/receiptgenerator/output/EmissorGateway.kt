package com.receiptgenerator.output

import com.receiptgenerator.entity.Emissor

interface EmissorGateway {
    fun save(emissor: Emissor): Emissor
}

