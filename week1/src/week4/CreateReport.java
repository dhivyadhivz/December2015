package week4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Admin\\MyWorkspace\\week1\\data\\Report.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Login");
		int noOfRows = sheet.getLastRowNum();
		System.out.println("no of rows:"+noOfRows);
		for(int i = 1;i<= noOfRows;i++){
			XSSFRow firstRow = sheet.getRow(i);
			XSSFCell cell0 = firstRow.getCell(0);
			System.out.println(cell0.getStringCellValue());
		}
		
//		XSSFRow Row1 = sheet.getRow(0);
//		XSSFCell cell1 = Row1.createCell(1);
//		cell1.setCellValue("STATUS");
		for(int i = 1;i<= noOfRows;i++){
			XSSFRow firstRow = sheet.getRow(i);
			XSSFCell cell12 = firstRow.createCell(firstRow.getLastCellNum());
			cell12.setCellValue("PASS");
				
		}
		
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Admin\\MyWorkspace\\week1\\data\\Report.xlsx"));
		workbook.write(fos);
		fos.close();
		workbook.close();
	}
		
		
	}



