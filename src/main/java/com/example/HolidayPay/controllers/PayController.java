package com.example.HolidayPay.controllers;

import com.example.HolidayPay.models.Pay;
import com.example.HolidayPay.services.PayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;

@Controller
@RequiredArgsConstructor
public class PayController {
    private final PayService payService;
    @GetMapping("/")
    public String pay(Model model)
    {   model.addAttribute("pays", payService.listUsers());
        return "pay";
    }

    @PostMapping("/pay/create")
    public String createPay(Pay pay) throws ParseException {
        payService.savePay(pay);
        return "redirect:/";
    }

}
