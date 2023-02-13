package com.example.HolidayPay.controllers;

import com.example.HolidayPay.services.PayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class PayController {
    private final PayService payService;
    @GetMapping("/")
    public String pay(Model model)
    {   model.addAttribute("pays", payService.listUsers());
        return "pay";
    }
}
