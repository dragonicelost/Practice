package com.example.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class loan {
	
	@Column(name="loanid")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	Integer loanId;
	
	@Column(name="loanamount")
	Integer loanamount;
	
	@Column(name="term")
	Integer termno;
	
	@Column(name="loantype")
	String loantype;
	
	@Column(name="interestrate")
	Double interestrate;

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public Integer getLoanAmount() {
		return loanamount;
	}

	public void setLoanAmount(Integer loanAmount) {
		this.loanamount = loanAmount;
	}

	public Integer getTermno() {
		return termno;
	}

	public void setTermno(Integer termno) {
		this.termno = termno;
	}

	public String getLoanType() {
		return loantype;
	}

	public void setLoanType(String loanType) {
		this.loantype = loanType;
	}

	public Double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(Double interestrate) {
		this.interestrate = interestrate;
	}

}
