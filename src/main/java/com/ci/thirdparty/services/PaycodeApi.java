package com.ci.thirdparty.services;

import com.ci.thirdparty.dtos.CancelPaycode;
import com.ci.thirdparty.dtos.CancelPaycodeResponse;
import com.ci.thirdparty.dtos.PaycodeRequest;
import com.ci.thirdparty.dtos.PaycodeResponse;
import com.ci.thirdparty.models.Paycode;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PaycodeApi {
    @POST("/generate_paycode")
    Call<PaycodeResponse> generatePaycode(@Body PaycodeRequest paycodeRequest);

    @POST("/cancel_paycode")
    Call<CancelPaycodeResponse> cancelPaycode(CancelPaycode cancelPaycode);
}
