package com.payment.controller;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.Models.Payment;
import com.payment.repository.PayRepository;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;

@RestController
public class payController {
	
	@Autowired
	private PayRepository payRepository;
	
	@PostMapping("/addpayment")   //To add payment
	public Payment addPayment(@RequestBody Payment payment) {
		
		return payRepository.save(payment);
	}
	
	
	@GetMapping("/addpayment") //To get all the payments
	public List<Payment> getAllPayments(){
		
		return payRepository.findAll();
		
	}
	
	
	//creating order for payment
	
	//@PostMapping("/create_order")
	@PostMapping("/pay")
	@ResponseBody  			//
	public String paymoney(@RequestBody Map<String, Object> data) throws Exception {				//here we accept data in map
		System.out.println ("--------------------------------------------------------------------");

		int amt=Integer.parseInt(data.get("amount").toString ());     //we get the data & change it to string and  then change to int

		//here we use razorpayapi to generate order
		//Return the order id to client
		RazorpayClient razorpayClient = new RazorpayClient("rzp_test_0y2syC7YW4M7gG", "b3JNF9iNuF413KMjvVloV6IV"); 	//key,secret
		JSONObject options = new JSONObject(); 
		options.put("amount", amt*100);  // here integer means rupees but we have to convert it to paise so here we multiply to amount by 100 so we get the amount in paise 
		options.put("currency", "INR"); 	
		options.put("receipt", "txn_123456"); 
		
		//creating new order--
		Order order = razorpayClient.orders.create(options);  
		System.out.println (order) ;
		
		return order.toString();
	
	}

}



