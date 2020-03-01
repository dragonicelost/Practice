package com.example.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.dao.dao_class;
import com.example.practice.model.loan_model;




@Service
public class serviceimpl implements serviceclass{
	
	@Autowired
	dao_class  dm;

	@Override
	public String getall() {
		List<loan_model> lp=dm.getall();
		System.out.println(lp.get(0).getInterestrate()+"in service");
		
		return "OK";
	}

}
