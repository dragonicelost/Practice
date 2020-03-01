package com.example.practice.model;

import javax.persistence.Column;

public class loan_model {

	Integer loanId;
	
	
	Integer loanAmount;
	
	
	Integer termno;
	
	
	String LoanType;
	
	
	Double Interestrate;


	public Integer getLoanId() {
		return loanId;
	}


	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}


	public Integer getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}


	public Integer getTermno() {
		return termno;
	}


	public void setTermno(Integer termno) {
		this.termno = termno;
	}


	public String getLoanType() {
		return LoanType;
	}


	public void setLoanType(String loanType) {
		LoanType = loanType;
	}


	public Double getInterestrate() {
		return Interestrate;
	}


	public void setInterestrate(Double interestrate) {
		Interestrate = interestrate;
	}

	
	
}
