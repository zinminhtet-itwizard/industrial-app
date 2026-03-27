package com.example.indestrial.app.payment;

import java.util.HashMap;
import java.util.Map;

class PaymentRegistry {
    
  private final Map<String, PaymentStrategy> registry = new HashMap<>();
  
  void register(String name, PaymentStrategy strategy) {
    registry.put(name, strategy);
  }
  
  PaymentStrategy get(String name) {
    if (!registry.containsKey(name)) {
      throw new IllegalArgumentException("Unknown strategy: " + name);
    }
    return registry.get(name);
  }
}