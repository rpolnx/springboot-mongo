package com.diguim.mongopoc.commons.exceptions

import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

class NotFoundException(message: String? = "") : RuntimeException(message)

class BadRequest(message: String? = "") : RuntimeException(message)

@ControllerAdvice
class GlobalExceptionHandler() {

    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(value = [NotFoundException::class])
    fun handleNotFoundException(ex: NotFoundException) = ex

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(value = [BadRequest::class])
    fun handleBadRequestException(ex: BadRequest) = ex

    @ExceptionHandler(value = [RuntimeException::class])
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    fun generalHandler(ex: RuntimeException) = ex

}