package com.example.HolidayPay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PayController {
    @GetMapping("/")
    public String pay(){
        return "pay";
    }
}
