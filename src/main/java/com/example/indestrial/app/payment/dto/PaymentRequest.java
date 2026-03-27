package com.example.indestrial.app.payment.dto;

import com.example.indestrial.app.payment.Order;

public record PaymentRequest(
  String type,
  Order order
) {

}
