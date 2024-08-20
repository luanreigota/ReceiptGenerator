package com.receiptgenerator.repository.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "tb_telefone")
data class Telefone(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "numero", nullable = false, length = 9)
    val numero: String,

    @Column(name = "ddd", nullable = false, length = 3)
    val ddd: String,

    @Column(name = "principal", nullable = false)
    val principal: Boolean = true,


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_criacao", nullable = false)
    val dataCriacao: LocalDateTime = LocalDateTime.now(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emissor_id")
    val emissor: Emissor
) {
    constructor() : this(
        id = 0L, numero = "", ddd = "", principal = false, dataCriacao = LocalDateTime.now(), emissor = Emissor()
    )
}
