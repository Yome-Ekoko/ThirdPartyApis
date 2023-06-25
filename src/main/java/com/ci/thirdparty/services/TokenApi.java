package com.ci.thirdparty.services;

import com.ci.thirdparty.dtos.TokenRequest;
import com.ci.thirdparty.dtos.TokenResponse;
import com.ci.thirdparty.models.Token;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TokenApi {
    @POST("/generate_token")
    Call<TokenResponse> generateToken(@Body TokenRequest tokenRequest);
}
