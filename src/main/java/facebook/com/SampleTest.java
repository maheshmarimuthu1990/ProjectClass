package facebook.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	public static void main(String[] args) throws IOException {

		File loc = new File(
				"C:\\Users\\shree\\eclipse-workspace\\AutomationFacebook\\Excel\\New Microsoft Office Excel Worksheet (2).xlsx");

		FileInputStream Stream = new FileInputStream(loc);

		Workbook wo = new XSSFWorkbook(Stream);

		Sheet s = wo.getSheet("Automation");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				System.out.println(type);
//if (type==1) {
//	String name = c.getStringCellValue();
//	System.out.println(name);
//	
//}
//if(type==0) {
//	if(DateUtil.isCellDateFormatted(c)) {
//	String name = new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
//	System.out.println(name);
//	}else {
//		double d=c.getNumericCellValue();
//		long l=(long)d;
//String name = String.valueOf(l);
//System.out.println(name);
	}
	
}
			}

	//	}

	}

