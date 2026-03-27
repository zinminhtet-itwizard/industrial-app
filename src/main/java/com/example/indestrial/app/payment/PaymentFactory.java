package com.example.indestrial.app.payment;

class PaymentFactory {
    
  private final ProcessPayment processPayment;
  private final RefundPayment refundPayment;
  
  // dependencies injected in
  PaymentFactory(ProcessPayment processPayment, RefundPayment refundPayment) {
    this.processPayment = processPayment;
    this.refundPayment = refundPayment;
  }
  
  PaymentStrategy create(String type) {
    switch (type) {
      case "process": return processPayment;
      case "refund": return refundPayment;
      default: throw new IllegalArgumentException("Unknown type: " + type);
    }
  }
}