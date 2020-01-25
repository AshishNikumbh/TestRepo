package day1.seleniumex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet0 = wb.createSheet("FirstSheet");
		
		XSSFRow row0 = sheet0.createRow(0);
		
		XSSFCell cellA = row0.createCell(0);
		XSSFCell cellB = row0.createCell(1);
		XSSFCell cellC = row0.createCell(2);
		
		cellA.setCellValue("ARNAV IS SWEET BOY");
		cellB.setCellValue("I LOVE YOU");
		cellC.setCellValue("HE LIKES TO PLAY FOOTBALL, CHESS, CRICKET");
		
	    FileOutputStream fileOut = new FileOutputStream("F:\\temp\\workbook.xlsx");
	    wb.write(fileOut);
	    fileOut.close();

		
		
		
		

	}

}
