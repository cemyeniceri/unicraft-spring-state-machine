package com.github.cemyeniceri.unicraftspringstatemachine.service;

import com.github.cemyeniceri.unicraftspringstatemachine.domain.Payment;
import com.github.cemyeniceri.unicraftspringstatemachine.domain.PaymentEvent;
import com.github.cemyeniceri.unicraftspringstatemachine.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
}
