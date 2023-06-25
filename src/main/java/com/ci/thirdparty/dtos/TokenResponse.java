package com.ci.thirdparty.dtos;

import lombok.Data;

@Data
public class TokenResponse {
    public String statusCode;
    public String statusMessage;
    public  String accessToken;
}
