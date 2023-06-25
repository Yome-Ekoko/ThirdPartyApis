package com.ci.thirdparty.services;

import com.ci.thirdparty.dtos.CancelPaycode;
import com.ci.thirdparty.dtos.CancelPaycodeResponse;
import com.ci.thirdparty.dtos.PaycodeRequest;
import com.ci.thirdparty.dtos.PaycodeResponse;
import com.ci.thirdparty.models.Paycode;
import org.springframework.stereotype.Service;

@Service
public interface PaycodeService {
    public PaycodeResponse generatePaycode(PaycodeRequest paycodeRequest);
    public CancelPaycodeResponse cancelPaycode(CancelPaycode cancelPaycode);
}
