package com.example.controller.controller.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api")
class RestController {

    @GetMapping("/hello")
    fun hello() : String?{
        val msg = "kotlin"
        return "hello $msg"
    }
}