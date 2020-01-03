package com.test.utility;
import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
			
		try {
			reader = new Xls_Reader("C:\\Stoneage\\Cave\\src\\test\\java\\com\\testdata\\TestData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		for(int rowNum = 2; rowNum <= reader.getRowCount("EmpData"); rowNum++) {
			
				String empName = reader.getCellData("EmpData", "EmpName", rowNum);
				String empId = reader.getCellData("EmpData", "EmpId", rowNum);
				String email = reader.getCellData("EmpData", "Email", rowNum);
				
				Object ob[] = {empName, empId, email};
				myData.add(ob);
		}
		return myData;	
	}
}
