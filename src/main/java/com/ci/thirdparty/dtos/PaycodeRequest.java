package com.ci.thirdparty.dtos;

import lombok.Data;

@Data
public class PaycodeRequest {
   public String requestId;
      public String wallet;
    public String  walletId;
    public String  amount;
    public String  tempPin;
    public String   callbackUrl;

}
