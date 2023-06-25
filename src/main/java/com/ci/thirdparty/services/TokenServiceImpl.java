package com.ci.thirdparty.services;

import com.ci.thirdparty.dtos.TokenRequest;
import com.ci.thirdparty.dtos.TokenResponse;
import com.ci.thirdparty.models.Token;
import com.ci.thirdparty.utils.RetrofitUtil;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
@Component
public class TokenServiceImpl implements TokenService
{
    private Retrofit retrofit;
    private  TokenApi tokenApi;
    public TokenServiceImpl()
    {
        retrofit= RetrofitUtil.getRetrofitInstance();
        tokenApi=retrofit.create(TokenApi.class);
    }

    @Override
    public TokenResponse generateToken(TokenRequest tokenRequest)
    {
        TokenResponse tokenResponse=new TokenResponse();
        Call<TokenResponse> generateTokenCall=tokenApi.generateToken(tokenRequest);
        try {
            Response<TokenResponse> response= generateTokenCall.execute();
            if(response.isSuccessful() && response.body() != null){
                tokenResponse=response.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tokenResponse;
    }
}
