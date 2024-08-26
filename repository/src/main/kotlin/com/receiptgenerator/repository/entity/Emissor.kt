package com.receiptgenerator.repository.entity

import jakarta.persistence.*
import org.hibernate.envers.Audited
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Entity
@Table(name = "tb_emissor")
@Audited(withModifiedFlag = true)
data class Emissor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "nome_completo", nullable = false, length = 50)
    val nomeCompleto: String,

    @Column(name = "documento", nullable = false, length = 20)
    val documento: String,

    @Column(name = "tipo_documento", nullable = false, length = 4)
    @Enumerated(EnumType.STRING)
    val tipoDocumento: TipoDocumentoEnum,

    @OneToMany(mappedBy = "emissor", cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
    val endereco: List<Endereco>? = null,

    @OneToMany(mappedBy = "emissor", cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
    val telefone: List<Telefone>? = null,

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_criacao", nullable = false)
    @CreatedDate
    val dataCriacao: LocalDateTime = LocalDateTime.now(),

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_atualizacao", nullable = false)
    @LastModifiedDate
    val dataAtualizacao: LocalDateTime = LocalDateTime.now()

) {
    constructor() : this(
        id = 0,
        nomeCompleto = "",
        documento = "",
        tipoDocumento = TipoDocumentoEnum.CPF,
        endereco = null,
        telefone = null,
        dataCriacao = LocalDateTime.now()
    )
}

enum class TipoDocumentoEnum {
    CPF, CNPJ
}
