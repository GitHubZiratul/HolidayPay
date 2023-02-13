package com.example.HolidayPay.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {
    @GetMapping("/")
    public String pay(){
        return "pay";
    }
}
