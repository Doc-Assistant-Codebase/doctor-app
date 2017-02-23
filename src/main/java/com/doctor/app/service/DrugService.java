package com.doctor.app.service;

import java.util.List;

import com.doctor.app.to.Drug;

public interface DrugService {
	
	List<Drug> getAllDrugs();
	
	void updateDrugList();
	
	String sayHello();
	
}
