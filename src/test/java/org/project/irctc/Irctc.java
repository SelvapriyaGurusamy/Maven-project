package org.project.irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static WebDriver driver;
	public static void  irctc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
			driver.manage().window().maximize();
			driver.findElement(By.name("userId")).sendKeys("abala1987");
			driver.findElement(By.name("pwd")).sendKeys("bala");
			Thread.sleep(10000);
			/*WebElement captcha = driver.findElement(By.xpath("//div[@class='captcha_div']"));
			String txt = captcha.getText();
			System.out.println(txt);
			driver.findElement(By.name("captcha")).sendKeys(txt);*/
			driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
					

	}
	
	public static void main(String[] args) throws InterruptedException {
		irctc();
	}
	
	
}
