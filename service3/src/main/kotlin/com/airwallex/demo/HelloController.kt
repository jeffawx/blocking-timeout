package com.airwallex.demo

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class HelloController {

    private val logger = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/test")
    fun hello(): String {
        logger.info("[service-3] in hello")

        Thread.sleep(2000)

        return "Hello World"
    }
}
