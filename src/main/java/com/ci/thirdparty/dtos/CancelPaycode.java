package com.ci.thirdparty.dtos;

import lombok.Data;

@Data
public class CancelPaycode {
    public String requestId;

    public String  walletId;

    public String  tempPin;
    public String   payCode;
}
