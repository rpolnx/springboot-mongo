package com.diguim.mongopoc.services

import com.diguim.mongopoc.domain.dto.CustomerDTO
import com.diguim.mongopoc.domain.dto.CustomerDTOCreate
import com.diguim.mongopoc.domain.dto.CustomerDTOPatch
import java.util.*

interface CustomerService {
    fun getAll(): List<CustomerDTO>

    fun getSingle(id: UUID): CustomerDTO

    fun create(data: CustomerDTO): CustomerDTOCreate

    fun update(id: UUID, data: CustomerDTO)

    fun delete(id: UUID)

    fun updateNameOrBirthday(id: UUID, dto: CustomerDTOPatch)
}