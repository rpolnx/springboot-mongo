package com.diguim.mongopoc.domain.repository.data

import java.time.LocalDateTime

abstract class BaseEntity() {
    protected var created: LocalDateTime = LocalDateTime.now()
    protected var updated: LocalDateTime? = null
}