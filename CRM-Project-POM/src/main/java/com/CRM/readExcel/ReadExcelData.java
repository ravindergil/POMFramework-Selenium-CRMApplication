package com.CRM.readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	
	static String fileName = "./data/TestCases_CRMProject.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheetName;
	XSSFRow Row;
	XSSFCell cell;
	int funCol;
	String FunctionName;
	
	public String getData(String FileName) throws EncryptedDocumentException, IOException {
		file = new File(fileName);
		
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheetName = workbook.getSheet("TestCases");
		
		int rowNum = sheetName.getPhysicalNumberOfRows();
		System.out.println("Physical number of Rows : " + rowNum);
			
		Row = sheetName.getRow(0);
		int cellNum = Row.getPhysicalNumberOfCells();		
		System.out.println("Physical number of Cell : " + cellNum );
		
		for(int i=0; i<rowNum; i++) {
			Row = sheetName.getRow(i);
			
			for(int j=0; j<cellNum; j++) {
				CellType Type = Row.getCell(j).getCellType();
				String cellValue = Row.getCell(j).getStringCellValue();
				
				if (Type.equals(CellType.STRING)) {
					if (cellValue.equals("Function_Keyword")) {
						//System.out.println(cellValue);
						//System.out.println(j);	
					}
					funCol=j;	
				}	
			}	
			FunctionName = Row.getCell(funCol).getStringCellValue();
			System.out.println(FunctionName);
		} 
		return FunctionName;
	}
	
	
	public void printFunction() throws EncryptedDocumentException, IOException {
		 System.out.println(getData(fileName));
	}
		
	



	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ReadExcelData re = new ReadExcelData();
		re.printFunction();
		
		
	}
}
