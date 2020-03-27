package com.diguim.mongopoc.controllers

import com.diguim.mongopoc.domain.dto.CustomerDTO
import com.diguim.mongopoc.services.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("customer")
class CustomerController(@Autowired val customerService: CustomerService) {

    @GetMapping
    @ResponseStatus(OK)
    fun getAll(): List<CustomerDTO> = customerService.getAll()

    @GetMapping("{id}")
    @ResponseStatus(OK)
    fun getSingle(@PathVariable("id") id: UUID): CustomerDTO = customerService.getSingle(id)

    @PostMapping
    @ResponseStatus(CREATED)
    fun create(@Valid @RequestBody dto: CustomerDTO) = customerService.create(dto)

    @PutMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    fun update(@PathVariable("id") id: UUID, @Valid @RequestBody dto: CustomerDTO) {
        customerService.update(id, dto)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(ACCEPTED)
    fun delete(@PathVariable("id") id: UUID) = customerService.delete(id)

}