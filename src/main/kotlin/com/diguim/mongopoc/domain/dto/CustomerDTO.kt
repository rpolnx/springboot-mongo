package com.diguim.mongopoc.domain.dto

import com.diguim.mongopoc.domain.repository.data.Customer
import org.jetbrains.annotations.NotNull
import java.time.LocalDate
import java.util.*
import javax.validation.constraints.NotBlank

class CustomerDTO(val id: UUID?,
                  @NotNull @NotBlank val name: String,
                  val cpf: String?,
                  val birthday: LocalDate?) {

    companion object {
        fun of(customer: Customer): CustomerDTO = CustomerDTO(customer.id, customer.name, customer.cpf, customer.birthday)
    }

}

class CustomerDTOCreate(val id: UUID) {
    companion object {
        fun of(customer: Customer): CustomerDTOCreate = CustomerDTOCreate(customer.id)
    }
}