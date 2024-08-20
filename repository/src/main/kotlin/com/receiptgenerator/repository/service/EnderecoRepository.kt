package com.receiptgenerator.repository.service

import com.receiptgenerator.repository.entity.Endereco
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface EnderecoRepository : JpaRepository<Endereco, Long>