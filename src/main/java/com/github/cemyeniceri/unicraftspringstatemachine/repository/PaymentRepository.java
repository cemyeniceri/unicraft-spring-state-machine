package com.github.cemyeniceri.unicraftspringstatemachine.repository;

import com.github.cemyeniceri.unicraftspringstatemachine.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
