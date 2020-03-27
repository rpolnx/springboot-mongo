package com.diguim.mongopoc.services

import com.diguim.mongopoc.commons.exceptions.NotFoundException
import com.diguim.mongopoc.domain.dto.CustomerDTO
import com.diguim.mongopoc.domain.dto.CustomerDTOCreate
import com.diguim.mongopoc.domain.repository.CustomerRepository
import com.diguim.mongopoc.domain.repository.data.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerServiceImpl(@Autowired val customerRepository: CustomerRepository) : CustomerService {

    override fun getAll(): List<CustomerDTO> {
        return customerRepository.findAll()
                .map { CustomerDTO.of(it) }
    }

    override fun getSingle(id: UUID): CustomerDTO {
        return customerRepository.findById(id)
                .map { CustomerDTO.of(it) }
                .orElseThrow { throw NotFoundException("Customer Not Found") }
    }

    override fun create(data: CustomerDTO): CustomerDTOCreate {
        return Customer(name = data.name, cpf = data.cpf, birthday = data.birthday)
                .let { CustomerDTOCreate.of(customerRepository.save(it)) }
    }

    override fun update(id: UUID, data: CustomerDTO) {
        Customer(id = id.toString(), name = data.name, cpf = data.cpf, birthday = data.birthday)
                .also { customerRepository.save(it) }
    }

    override fun delete(id: UUID) {
        customerRepository.deleteById(id);
    }
}