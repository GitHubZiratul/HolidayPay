package com.example.HolidayPay.services;

import com.example.HolidayPay.models.Pay;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PayService {
    private List<Pay> users = new ArrayList<>();

    {
        users.add((new Pay("Islam","20.11.2022","20.12.2022",15000)));
    }

    public List<Pay> listUsers(){return users;}

    public void saveUser(Pay user){
        users.add(user);

    }
}
