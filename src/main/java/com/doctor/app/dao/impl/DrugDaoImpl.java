package com.doctor.app.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.doctor.app.dao.AbstractDao;
import com.doctor.app.dao.DrugDao;
import com.doctor.app.to.Drug;

@Repository
public class DrugDaoImpl extends AbstractDao<Long, Drug> implements DrugDao{

	@Override
	public List<Drug> getAllDrugs() {
		Criteria criteria = createEntityCriteria();
		return (List<Drug>) criteria.list().stream().distinct().collect(Collectors.toList());
	}

	@Override
	public void updateDrugList(List<Drug> drugs) {
		for(Drug drug : drugs){
			this.saveDrug(drug);
		}		
	}
	
	public void saveDrug(Drug drug){
		persist(drug);
	}

	@Override
	public String sayHello() {
		return "Hello from DAO";
	}
}