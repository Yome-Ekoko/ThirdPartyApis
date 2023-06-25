package com.ci.thirdparty.utils;

import com.ci.thirdparty.constants.RetrofitConstants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil
{
    private static Retrofit retrofit=null;
    public static Retrofit getRetrofitInstance(){
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(RetrofitConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
