package com.doctor.app.service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doctor.app.dao.DrugDao;
import com.doctor.app.service.DrugService;
import com.doctor.app.to.Drug;

@Service("drugService")
@Transactional
public class DrugServiceImpl implements DrugService {
	private long medicineId;

	@Autowired
	private DrugDao drugDao;

	@Override
	public List<Drug> getAllDrugs() {
		return drugDao.getAllDrugs();
	}

	@Override
	public String updateDrugList() {
		try {
			List<Drug> drugList = new ArrayList<Drug>();
			InputStream file = this.getClass().getClassLoader().getResourceAsStream("drug-db.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Drug drug = new Drug();
				drug.setMedicineId(medicineId++);
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext() && !(row.getRowNum() == 0)) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						int intColIndex = cell.getColumnIndex();
						if (intColIndex == 2) {
							drug.setStrength(cell.getNumericCellValue());
						} else if (intColIndex == 3) {
							drug.setFrequency(cell.getNumericCellValue());
						} else {
							drug.setDuration(cell.getNumericCellValue());
						}
						System.out.print(cell.getNumericCellValue() + "\t\t");
						break;
					case Cell.CELL_TYPE_STRING:
						int strColIndex = cell.getColumnIndex();
						if (strColIndex == 0) {
							drug.setDrugForm(cell.getStringCellValue());
						} else if(strColIndex == 1) {
							drug.setTradeName(cell.getStringCellValue());
						} else {
							drug.setInstructions(cell.getStringCellValue());
						}
						break;
					}
				}
				if(null != drug.getDrugForm()){
					drugList.add(drug);	
				}
			}
			file.close();
			drugDao.updateDrugList(drugList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Updated!";
	}

	@Override
	public String sayHello() {
		return drugDao.sayHello();
	}
}