package com.diguim.mongopoc.domain.dto

import com.diguim.mongopoc.domain.repository.data.Customer
import java.time.LocalDate
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class CustomerDTO(val id: UUID?,
                  val name: String?,
                  @field: [NotNull NotBlank(message = "Not empty")] val cpf: String,
                  val birthday: LocalDate?) {

    companion object {
        fun of(customer: Customer): CustomerDTO = CustomerDTO(UUID.fromString(customer.id), customer.name, customer.cpf,
                customer.birthday)
    }

}

class CustomerDTOCreate(val id: UUID) {
    companion object {
        fun of(customer: Customer): CustomerDTOCreate = CustomerDTOCreate(UUID.fromString(customer.id))
    }
}