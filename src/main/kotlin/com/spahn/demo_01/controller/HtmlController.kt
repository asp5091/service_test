package com.spahn.demo_01.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HtmlController {
    @GetMapping("/")
    fun index(model:Model): String {
        return "index"
    }

    @GetMapping("/sign")
    fun htmlSign(model: Model) : String {
        return "sign"
    }

    @PostMapping("/addTimeColumn")
    fun addTimeColumn(model: Model) {

    }
}