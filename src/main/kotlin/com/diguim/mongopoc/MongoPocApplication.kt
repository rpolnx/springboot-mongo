package com.diguim.mongopoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing

@SpringBootApplication
@EnableMongoAuditing
class MongoPocApplication

fun main(args: Array<String>) {
	runApplication<MongoPocApplication>(*args)
}
