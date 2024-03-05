package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelFileProg {
	@DataProvider(name = "logindata")
	public String[][] ExcelFunction() throws Exception {
		File newFile = new File("C:\\Users\\haithal\\Documents\\exceldatadriven.xlsx");
		FileInputStream fin = new FileInputStream(newFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int noofrows = sheet.getPhysicalNumberOfRows();
		System.out.println(noofrows);

		/*
		 * int noofcoloums = sheet.getRow(0).getLastCellNum(); int noofcoloums1 =
		 * sheet.getRow(1).getLastCellNum(); int nocol = noofcoloums + noofcoloums1;
		 */

	
		int noOfCols = sheet.getRow(0).getLastCellNum();
		System.out.println(noOfCols);

		String[][] data = new String[noofrows - 1][noOfCols];
		for (int i = 0; i < noofrows - 1; i++) {
			for (int j = 0; j < noOfCols; j++) {
				DataFormatter dt = new DataFormatter();
				data[i][j] = dt.formatCellValue(sheet.getRow(i + 1).getCell(j));

			}
			System.out.println();

		}
		workbook.close();
		fin.close();

		for (String[] dataarr : data) {
			System.out.println(Arrays.toString(dataarr));
		}

		return data;

	}
}
