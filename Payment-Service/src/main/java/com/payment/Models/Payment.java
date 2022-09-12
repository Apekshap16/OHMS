package com.payment.Models;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;



import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Payment")
public class Payment {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long paymentNo;
	private int total;
	private LocalDate payTime;
	private int creditCardNo;
	private int creditCardCVV;
	private LocalDate creditCardExpiryDate;
	
	public Payment() {
		super();
		}

	public Payment(Long paymentNo, int total, LocalDate payTime, int creditCardNo, int creditCardCVV,
			LocalDate creditCardExpiryDate) {
		super();
		this.paymentNo = paymentNo;
		this.total = total;
		this.payTime = payTime;
		this.creditCardNo = creditCardNo;
		this.creditCardCVV = creditCardCVV;
		this.creditCardExpiryDate = creditCardExpiryDate;
	}

	public Long getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(Long paymentNo) {
		this.paymentNo = paymentNo;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public LocalDate getPayTime() {
		return payTime;
	}

	public void setPayTime(LocalDate payTime) {
		this.payTime = payTime;
	}

	public int getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(int creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public int getCreditCardCVV() {
		return creditCardCVV;
	}

	public void setCreditCardCVV(int creditCardCVV) {
		this.creditCardCVV = creditCardCVV;
	}

	public LocalDate getCreditCardExpiryDate() {
		return creditCardExpiryDate;
	}

	public void setCreditCardExpiryDate(LocalDate creditCardExpiryDate) {
		this.creditCardExpiryDate = creditCardExpiryDate;
	}
	
	

	
}
