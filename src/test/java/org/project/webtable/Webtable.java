package org.project.webtable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.apache.xmlbeans.impl.jam.mutable.MAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class Webtable {
	/*public static void table() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		Thread.sleep(3000);
		driver.findElement(By.id("cookie_action_close_header")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='cp-overlay-close cp-image-close cp-inside-close cp-adjacent-right']")).click();
		List<WebElement>	tHead = driver.findElements(By.tagName("th"));
		for(int k=0; k<tHead.size(); k++){
		System.out.println(tHead.get(k).getText());
		}
		List<WebElement>	tRow =	driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
				List<WebElement> tData = tRow.get(i).findElements(By.tagName("td"));
					for(int j=0; j<tData.size(); j++) {
					System.out.println(tData.get(j).getText());
					}
			
		}
	}
public static void main(String[] args) throws InterruptedException {
	table();
}*/


	
//FISTROW and GET DETAILS

/*public static void tablefirst() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	Thread.sleep(3000);
	driver.findElement(By.id("cookie_action_close_header")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[@class='cp-overlay-close cp-image-close cp-inside-close cp-adjacent-right']")).click();
	
	List<WebElement>	tRow =	driver.findElements(By.tagName("tr"));
	List<WebElement> tData = tRow.get(1).findElements(By.tagName("td"));
	
	for(int j=0; j<tData.size(); j++) {
	System.out.println(tData.get(j).getText());
	}
	
	}
public static void main(String[] args) throws InterruptedException {
	tablefirst();
	
}*/
	
	
	/*public static void tablechina() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		Thread.sleep(3000);
		driver.findElement(By.id("cookie_action_close_header")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='cp-overlay-close cp-image-close cp-inside-close cp-adjacent-right']")).click();
		List<WebElement>	tRow =	driver.findElements(By.tagName("tr"));
		List<WebElement> tData = tRow.get(tRow.size()-1).findElements(By.tagName("td"));
		String s = (tData.get(0).getText());
		System.out.println(s);
		if(s.equals("China")) {
			driver.findElement(By.xpath("(//a[text()='details'])[4]")).click();
			System.out.println("click on details");
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		tablechina();
	}*/
	
	public static void excel() throws InterruptedException, IOException {
			
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.toolsqa.com/automation-practice-table/");
			Thread.sleep(3000);
			driver.findElement(By.id("cookie_action_close_header")).click();
			Thread.sleep(10000);
			//driver.findElement(By.xpath("//div[@class='cp-overlay-close cp-image-close cp-inside-close cp-adjacent-right']")).click();
			List<WebElement>	tRow =	driver.findElements(By.tagName("tr"));
			int rowsize = tRow.size();
			//System.out.println(rowsize);
			for (int i = 0; i <rowsize; i++) {
			List<WebElement> tData = tRow.get(i).findElements(By.tagName("td"));
			int datasize = tData.size();
			//System.out.println(datasize);
			for (int j = 0; j < datasize; j++) {
				String data = tData.get(j).getText();
				System.out.println(data);
				File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\target\\Book2.xlsx");
				FileInputStream fis = new FileInputStream(f);
				XSSFWorkbook xsfwb = new XSSFWorkbook(fis);
				XSSFSheet xsfsheet =  xsfwb.getSheet("Sheet2");
				XSSFRow xsfrow = xsfsheet.createRow(i);
				XSSFCell cell = xsfrow.createCell(j);
					cell.setCellValue(tData.get(j).getText());
					FileOutputStream fio = new FileOutputStream(f);
					xsfwb.write(fio);
					//System.out.println("data was written");
			}
			
			}
				
			}
			
	
	public static void main(String[] args) throws InterruptedException, IOException {
		excel();
	}
}
			
			
		
		
	
	
	
