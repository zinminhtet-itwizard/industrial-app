package com.example.indestrial.app.payment.dto;

import com.example.indestrial.app.payment.OrderData;

public record PaymentRequest(
  String type,
  OrderData orderData
) {

}
