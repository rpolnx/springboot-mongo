package com.diguim.mongopoc.domain.repository.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.util.*

@Document(collection = "customer")
data class Customer(@Id val id: String = UUID.randomUUID().toString(),
                    val name: String?,
                    val cpf: String,
                    val birthday: LocalDate?) : BaseEntity() {
}