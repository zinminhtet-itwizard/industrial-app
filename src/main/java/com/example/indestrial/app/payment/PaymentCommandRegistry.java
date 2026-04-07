package com.example.indestrial.app.payment;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PaymentCommandRegistry {

  private final Map<PaymentType, PaymentCommand> commands = new EnumMap<>(PaymentType.class);

  public PaymentCommandRegistry(List<PaymentCommand> paymentCommands) {
    paymentCommands.forEach(command -> commands.put(getType(command), command));
  }

  public PaymentCommand getCommand(PaymentType type) {
    PaymentCommand command = commands.get(type);
    if (command == null) {
      throw new IllegalArgumentException("No command registered for type: " + type);
    }
    return command;
  }

  private PaymentType getType(PaymentCommand command) {
    Class<? extends PaymentCommand> className = command.getClass();
    PaymentHandler annotation = className.getAnnotation(PaymentHandler.class);
    if (annotation == null) {
      throw new IllegalStateException("PaymentHandler annotation is needed for class: " + className);
    }
    PaymentType type = annotation.value();
    return type;
  }
}
