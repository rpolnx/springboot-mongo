package com.diguim.mongopoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongoPocApplication

fun main(args: Array<String>) {
	runApplication<MongoPocApplication>(*args)
}
