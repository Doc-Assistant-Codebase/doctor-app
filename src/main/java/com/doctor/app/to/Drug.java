package com.doctor.app.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drug {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long medicineId;
	private String drugForm;
	private String tradeName;
	private int strength;
	private int frequency;
	private int duration;
	private String instructions;
	
	public Drug(Long medicineId, String drugForm, String tradeName, int strength, int frequency, int duration,
			String instructions) {
		super();
		this.medicineId = medicineId;
		this.drugForm = drugForm;
		this.tradeName = tradeName;
		this.strength = strength;
		this.frequency = frequency;
		this.duration = duration;
		this.instructions = instructions;
	}
	
	public Long getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(Long medicineId) {
		this.medicineId = medicineId;
	}
	public String getDrugForm() {
		return drugForm;
	}
	public void setDrugForm(String drugForm) {
		this.drugForm = drugForm;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}	
}