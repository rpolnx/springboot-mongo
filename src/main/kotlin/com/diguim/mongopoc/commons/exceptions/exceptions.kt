package com.diguim.mongopoc.commons.exceptions

import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(NOT_FOUND)
class NotFoundException(message: String? = "") : RuntimeException(message)

@ResponseStatus(BAD_REQUEST)
class BadRequest(message: String? = "") : RuntimeException(message)

@ControllerAdvice
class GlobalExceptionHandler() {

    @ExceptionHandler(value = [NotFoundException::class])
    fun handleNotFoundException(ex: NotFoundException) = println(ex)

    @ExceptionHandler(value = [BadRequest::class])
    fun handleBadRequestException(ex: BadRequest) = println(ex)

    @ExceptionHandler(value = [Exception::class])
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    fun generalHandler(ex: Exception) = println(ex)

}