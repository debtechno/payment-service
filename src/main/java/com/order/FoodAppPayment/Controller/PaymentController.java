package com.order.FoodAppPayment.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.FoodAppPayment.Model.PaymentEntity;
import com.order.FoodAppPayment.Repository.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin(origins="http://localhost:3000")
@RestController

public class PaymentController {
	
	@Autowired
	PaymentRepository paymentRepo;
	
	@PostMapping("/payment")
	public void save(@RequestBody PaymentEntity paymentEntity) {
		paymentRepo.save(paymentEntity);
	}
}
