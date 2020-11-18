package com.github.cemyeniceri.unicraftspringstatemachine.config.guard;

import com.github.cemyeniceri.unicraftspringstatemachine.domain.PaymentEvent;
import com.github.cemyeniceri.unicraftspringstatemachine.domain.PaymentState;
import com.github.cemyeniceri.unicraftspringstatemachine.service.PaymentServiceImpl;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.guard.Guard;
import org.springframework.stereotype.Component;

@Component
public class PaymentIdGuard implements Guard<PaymentState, PaymentEvent> {

    @Override
    public boolean evaluate(StateContext<PaymentState, PaymentEvent> context) {
        return context.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER) != null;
    }
}