package com.example.indestrial.app.payment;

import org.springframework.stereotype.Component;

@Component
@PaymentHandler(PaymentType.REFUND)
public class RefundPaymentCommand implements PaymentCommand {

  @Override
  public void execute(OrderData order) {}
}
