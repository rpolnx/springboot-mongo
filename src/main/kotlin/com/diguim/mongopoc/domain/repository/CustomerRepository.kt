package com.diguim.mongopoc.domain.repository

import com.diguim.mongopoc.domain.repository.data.Customer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CustomerRepository : MongoRepository<Customer, String>