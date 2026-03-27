package com.example.indestrial.app.payment.dto;

import com.example.indestrial.app.payment.Order;
import com.example.indestrial.app.payment.PaymentType;

public record PaymentRequest(
  PaymentType type,
  Order order
) {

}
