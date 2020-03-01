package com.example.practice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.practice.model.loan_model;

public interface dao_class {

	public List<loan_model> getall();
}
