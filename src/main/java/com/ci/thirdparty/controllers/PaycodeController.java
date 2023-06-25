package com.ci.thirdparty.controllers;

import com.ci.thirdparty.dtos.PaycodeRequest;
import com.ci.thirdparty.dtos.PaycodeResponse;
import com.ci.thirdparty.models.Paycode;
import com.ci.thirdparty.services.PaycodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vi/paycode")
public class PaycodeController {
    @Autowired
    private PaycodeService paycodeService;

    @PostMapping("/paycode")
    public PaycodeResponse generatePaycode(@RequestBody PaycodeRequest paycodeRequest)
    {
         return paycodeService.generatePaycode(paycodeRequest);
    }

}
