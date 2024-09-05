package com.spahn.demo_01

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class Demo01Application

fun main(args: Array<String>) {
	runApplication<Demo01Application>(*args)

}
