package com.diguim.mongopoc.ext

import com.diguim.mongopoc.domain.dto.CustomerDTO
import com.diguim.mongopoc.domain.dto.CustomerDTOCreate
import com.diguim.mongopoc.domain.repository.data.Customer
import java.util.*

fun Customer.toResponse() = CustomerDTO(UUID.fromString(this.id), this.name, this.cpf, this.birthday)

fun Customer.toCreatedResponse() = CustomerDTOCreate(UUID.fromString(this.id))