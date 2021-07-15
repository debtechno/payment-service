package com.order.FoodAppPayment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.FoodAppPayment.Model.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

}
