package com.example.indestrial.app.payment;

import org.springframework.web.bind.annotation.RestController;

import com.example.indestrial.app.payment.dto.PaymentRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PaymentController {

  @PostMapping("/payment")
  public void handle(@RequestBody PaymentRequest request) {
    PaymentType type = PaymentType.valueOf(request.type());
    type.getStrategy().execute(request.order());
  }
  
}