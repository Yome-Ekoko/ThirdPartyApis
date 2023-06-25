package com.ci.thirdparty.dtos;

import lombok.Data;

@Data
public class PaycodeResponse {
    public String statusCode;
    public String statusMessage;
    public String requestId;
    public  String payCode;
}
