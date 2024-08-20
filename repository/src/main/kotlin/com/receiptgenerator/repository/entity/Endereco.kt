package com.receiptgenerator.repository.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "tb_endereco")
data class Endereco(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "logradouro", nullable = false, length = 100)
    val logradouro: String,

    @Column(name = "numero", nullable = false, length = 10)
    val numero: String,

    @Column(name = "cidade", nullable = false, length = 50)
    val cidade: String,

    @Column(name = "estado", nullable = false, length = 50)
    val estado: String,

    @Column(name = "pais", nullable = false, length = 30)
    val pais: String,

    @Column(name = "cep", nullable = false, length = 8)
    val cep: String,

    @Column(name = "bairro", nullable = false, length = 50)
    val bairro: String,


    @Column(name = "complemento", nullable = false, length = 100)
    val complemento: String? = null,


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_criacao", nullable = false)
    val dataCriacao: LocalDateTime = LocalDateTime.now(),


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emissor_id")
    val emissor: Emissor
) {
    constructor() : this(
           id= 0,logradouro= "", numero = "", cidade = "", estado = "", pais = "", cep = "", bairro = "", complemento = "", dataCriacao = LocalDateTime.now(), emissor = Emissor()
    )
}
