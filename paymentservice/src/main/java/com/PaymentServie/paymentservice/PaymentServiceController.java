package com.PaymentServie.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServiceController {
    @Autowired
    private CartRestConsumer cartConsumer;

    @GetMapping("/getpayments")
    public String getPaymentData(){
        return "From Payment Service : "+cartConsumer.getCartData();
    }
}
