package org.project.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass2 {
	
	//Excel Read Write	
	/*public static void Excel() throws IOException   {
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\target\\Book2.xlsx");
		FileInputStream file1 = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(file1);
		Sheet sheet = wb.getSheet("Sheet1");
		String data=null;
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if(cellType==1) {
					 data = cell.getStringCellValue();
					System.out.println(data);
				}
	
				else if(cellType==0) {
					double d = cell.getNumericCellValue();
					data = String.valueOf(d);
					System.out.println(data);
				}
				else if(DateUtil.isCellDateFormatted(cell)) {
					Date da = cell.getDateCellValue();
					SimpleDateFormat f = new SimpleDateFormat();
					data = f.format(da);
					System.out.println(data);
				}
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		Excel();
	}
	*/
	
	
	
	//Excel Write
	
	
	
	
	public static void writeExcel() throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Project Class\\Chrome1\\chromedriver.exe");
		  WebDriver	 driver =  new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		 WebElement ele =  driver.findElement(By.id("email"));
		 ele.sendKeys("java");
		 String data = ele.getAttribute("value");
		 System.out.println(data);
		 
		File file2 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\target\\Book2.xlsx");
		FileInputStream file3 = new FileInputStream(file2);
		Workbook work = new XSSFWorkbook(file3);
		Sheet she = work.getSheet("Sheet1");
		Row r = she.getRow(1);
		Cell c = r.createCell(6);
		c.setCellValue(data);
		FileOutputStream fo = new FileOutputStream(file2);
		work.write(fo);
		System.out.println("name is write");
	}
		public static void main(String[] args) throws IOException {
		
			writeExcel();
		}
	
	
	
	//Update excel
	/*public static void updatEexcel() throws IOException {
		File file4 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\target\\Book2.xlsx");
		FileInputStream file5 = new FileInputStream(file4);
		Workbook work1 = new XSSFWorkbook(file5);
		Sheet she1 = work1.getSheet("Sheet1");
		Row r1 = she1.getRow(1);
		Cell c1 = r1.getCell(6);
	c1.setCellValue("Selvapriya Gurusamy");
	FileOutputStream fo1 = new FileOutputStream(file4);
	work1.write(fo1);
	System.out.println("cell is updated");
	
	
	}
	public static void main(String[] args) throws IOException {
		updatEexcel();
	}*/
}


