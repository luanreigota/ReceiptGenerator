package com.receiptgenerator.repository.service

import com.receiptgenerator.repository.entity.Emissor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource


@RepositoryRestResource
interface EmissorRepository: JpaRepository<Emissor, Long>