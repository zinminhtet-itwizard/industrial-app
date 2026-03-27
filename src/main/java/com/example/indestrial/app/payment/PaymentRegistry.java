package com.example.indestrial.app.payment;

import java.util.HashMap;
import java.util.Map;

class PaymentRegistry {
    
  private final Map<PaymentType, PaymentStrategy> registry = new HashMap<>();
  
  void register(PaymentType name, PaymentStrategy strategy) {
    registry.put(name, strategy);
  }
  
  PaymentStrategy get(PaymentType name) {
    if (!registry.containsKey(name)) {
      throw new IllegalArgumentException("Unknown strategy: " + name);
    }
    return registry.get(name);
  }
}