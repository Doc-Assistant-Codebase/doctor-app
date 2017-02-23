package com.doctor.app.dao;

import java.util.List;

import com.doctor.app.to.Drug;

public interface DrugDao {
	
	List<Drug> getAllDrugs();
	
	void updateDrugList();
	
	String sayHello();
	
}