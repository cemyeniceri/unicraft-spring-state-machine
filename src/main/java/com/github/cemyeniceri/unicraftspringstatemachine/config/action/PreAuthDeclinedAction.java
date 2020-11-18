package com.github.cemyeniceri.unicraftspringstatemachine.config.action;

import com.github.cemyeniceri.unicraftspringstatemachine.domain.PaymentEvent;
import com.github.cemyeniceri.unicraftspringstatemachine.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class PreAuthDeclinedAction implements Action<PaymentState, PaymentEvent> {
    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> context) {
        System.out.println("Sending Notification of PreAuth DECLINED");
    }
}