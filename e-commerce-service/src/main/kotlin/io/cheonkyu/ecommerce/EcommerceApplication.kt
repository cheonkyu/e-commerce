package io.cheonkyu.ecommerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan(basePackages = ["io.cheonkyu.ecommerce.domain.store.persist.jpa"])
class EcommerceApplication

fun main(args: Array<String>) {
	runApplication<EcommerceApplication>(*args)
}
