package com.example.HolidayPay.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pay {
    private Long pay;
    private String userName;
    private String vacationStart, vacationEnd;
    private int salary;



}

