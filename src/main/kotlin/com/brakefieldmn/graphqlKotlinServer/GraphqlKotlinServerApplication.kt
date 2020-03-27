package com.brakefieldmn.graphqlKotlinServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraphqlKotlinServerApplication

fun main(args: Array<String>) {
	runApplication<GraphqlKotlinServerApplication>(*args)
}
