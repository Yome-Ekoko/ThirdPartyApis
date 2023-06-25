package com.ci.thirdparty.services;

import com.ci.thirdparty.dtos.CancelPaycode;
import com.ci.thirdparty.dtos.CancelPaycodeResponse;
import com.ci.thirdparty.dtos.PaycodeRequest;
import com.ci.thirdparty.dtos.PaycodeResponse;
import com.ci.thirdparty.utils.RetrofitUtil;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
@Component

public class PaycodeServiceImpl implements PaycodeService
{
    private Retrofit retrofit;
    private PaycodeApi paycodeApi;;

    public PaycodeServiceImpl()
    {
        retrofit = RetrofitUtil.getRetrofitInstance();
        paycodeApi=retrofit.create(PaycodeApi.class);
    }
    @Override
    public PaycodeResponse generatePaycode(PaycodeRequest paycodeRequest)
    {
        PaycodeResponse paycodeResponse=new PaycodeResponse();
        Call<PaycodeResponse> generatePaycodeCall=paycodeApi.generatePaycode(paycodeRequest);
        try {
            Response<PaycodeResponse> response=generatePaycodeCall. execute();
            if(response.isSuccessful() && response.body() != null){
                System.out.println(response.body());
                paycodeResponse=response.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return paycodeResponse;
    }

    @Override
    public CancelPaycodeResponse cancelPaycode(CancelPaycode cancelPaycode) {
        CancelPaycodeResponse cancelPaycodeResponse=new CancelPaycodeResponse();
        Call<CancelPaycodeResponse> cancelPaycodeCall=paycodeApi.cancelPaycode(cancelPaycode);
        try {
            Response<CancelPaycodeResponse> response=cancelPaycodeCall. execute();
            if(response.isSuccessful() && response.body() != null){
                 cancelPaycodeResponse=response.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cancelPaycodeResponse;
    }
}
