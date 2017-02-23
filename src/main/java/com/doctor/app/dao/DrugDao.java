package com.doctor.app.dao;

import java.util.List;

import com.doctor.app.to.Drug;

public interface DrugDao {
	
	List<Drug> getAllDrugs();
	
	List<Drug> getDrugsByForm(String form);
	
	void updateDrugList(List<Drug> drugs);
	
	String sayHello();
	
}