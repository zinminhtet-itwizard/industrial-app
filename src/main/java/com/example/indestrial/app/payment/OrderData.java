package com.example.indestrial.app.payment;

import java.math.BigDecimal;

public record OrderData(String orderId, BigDecimal amount) {}