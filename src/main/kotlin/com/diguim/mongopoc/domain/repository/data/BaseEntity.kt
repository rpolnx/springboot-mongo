package com.diguim.mongopoc.domain.repository.data

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

abstract class BaseEntity {
    @CreatedDate
    protected lateinit var created: LocalDateTime
    @LastModifiedDate
    protected lateinit var updated: LocalDateTime
}