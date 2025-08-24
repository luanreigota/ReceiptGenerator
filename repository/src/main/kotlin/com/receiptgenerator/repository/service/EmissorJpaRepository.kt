package com.receiptgenerator.repository.service

import com.receiptgenerator.entity.Emissor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmissorJpaRepository : JpaRepository<Emissor, Long>
