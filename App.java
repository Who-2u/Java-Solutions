package com.paneer.excel;
import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class App {

	public static void main(String[] args)
		throws FileNotFoundException, IOException
	{
		Workbook wb = new XSSFWorkbook();

		OutputStream fileOut = new FileOutputStream("Geks.xlsx");
		Sheet sheet1 = wb.createSheet("new sheet");
		 XSSFRow row;
		 Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
		 studentData.put("1",new Object[] { "Roll No", "NAME", "Year" });
		  
		 studentData.put("2", new Object[] { "128", "Aditya","2nd year" });
		  
		 studentData.put( "3",new Object[] { "129", "Narayana", "2nd year" });
		  
		 studentData.put("4", new Object[] { "130", "Mohan","2nd year" });
		  
		 studentData.put("5", new Object[] { "131", "Radha","2nd year" });
		  
		 studentData.put("6", new Object[] { "132", "Gopal","2nd year" });
		 
		 Set<String> keyid = studentData.keySet();
		 int rowid = 0;
	     for (String key : keyid) {
	            row = (XSSFRow) sheet1.createRow(rowid++);
	            Object[] objectArr = studentData.get(key);
	            int cellid = 0;
	  
	            for (Object obj : objectArr) {
	                Cell cell = row.createCell(cellid++);
	                cell.setCellValue((String)obj);
	            }
	        }
		System.out.println("Sheets Has been Created successfully");

		int numberOfSheets = wb.getNumberOfSheets();
		System.out.println("Total Number of Sheets: "+ numberOfSheets);

		wb.write(fileOut);
	}
}

