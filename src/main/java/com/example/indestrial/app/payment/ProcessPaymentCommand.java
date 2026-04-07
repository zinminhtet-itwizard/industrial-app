package com.example.indestrial.app.payment;

import org.springframework.stereotype.Component;

@Component
@PaymentHandler(PaymentType.PROCESS)
public class ProcessPaymentCommand implements PaymentCommand {
  @Override
  public void execute(OrderData order) {}
}
