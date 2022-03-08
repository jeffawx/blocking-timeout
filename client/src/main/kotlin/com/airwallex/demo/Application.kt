package com.airwallex.demo

import java.time.Duration
import org.springframework.boot.web.client.RestTemplateBuilder

fun main() {
    val restTemplate = RestTemplateBuilder().setReadTimeout(Duration.ofMillis(1000)).build()
    val data = restTemplate.getForObject("http://localhost:8080/test", String::class.java)!!
    println(data)
}
