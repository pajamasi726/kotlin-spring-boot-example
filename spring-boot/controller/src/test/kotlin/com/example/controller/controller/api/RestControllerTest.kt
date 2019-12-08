package com.example.controller.controller.api

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
class RestControllerTest {

    @Autowired
    lateinit var mvc : MockMvc

    @Test
    fun helloTest(){
        val result = "hello kotlin"
        mvc.perform(get("/v1/api/hello"))   // api url
                .andExpect(status().isOk)   // status
                .andExpect(content().string(result))    // content
    }
}