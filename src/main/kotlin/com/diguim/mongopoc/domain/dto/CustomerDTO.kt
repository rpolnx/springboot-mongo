package com.diguim.mongopoc.domain.dto

import java.time.LocalDate
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class CustomerDTO(val id: UUID?,
                  val name: String?,
                  @field: [NotNull NotBlank(message = "Not empty")] val cpf: String,
                  val birthday: LocalDate?)

class CustomerDTOCreate(val id: UUID)

class CustomerDTOPatch(val name: String?,
                       val birthday: LocalDate?)