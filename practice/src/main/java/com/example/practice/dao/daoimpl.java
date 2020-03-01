package com.example.practice.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.practice.entity.loan;
import com.example.practice.model.loan_model;

@Repository
public class daoimpl implements dao_class{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<loan_model> getall() {
		String query="select c from loan c";
		Query q=em.createQuery(query);
		List<loan> l=q.getResultList();
		List<loan_model> l2= new ArrayList<loan_model>();
		for(loan l1 : l)
		{
			System.out.println("hello");
			loan_model p=new loan_model();
			p.setInterestrate(l1.getInterestrate());
			p.setLoanAmount(l1.getLoanAmount());
			l2.add(p);
		}
		
		return l2;
		// TODO Auto-generated method stub
	
	}

}
