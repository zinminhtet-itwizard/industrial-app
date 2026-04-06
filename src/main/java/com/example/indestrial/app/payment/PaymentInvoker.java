package com.example.indestrial.app.payment;

import java.util.ArrayDeque;
import java.util.Deque;

import org.springframework.stereotype.Component;

@Component
public class PaymentInvoker {

  private final Deque<CommandEntry> history = new ArrayDeque<>();

  public void execute(PaymentCommand command, OrderData order) {
    command.execute(order);
    history.push(new CommandEntry(command, order));
  }

  public void undo() {
    if (history.isEmpty()) {
      throw new IllegalStateException("No commands to undo");
    }
    CommandEntry entry = history.pop();
    entry.command().undo(entry.order());
  }

  private record CommandEntry(PaymentCommand command, OrderData order) {}
}
