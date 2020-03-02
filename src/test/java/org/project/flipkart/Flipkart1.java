package org.project.flipkart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {
	public static WebDriver driver;
	public static void  flip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\NewMaven\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		
			Thread.sleep(3000);
			String Window = driver.getWindowHandle();
			System.out.println(Window);
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			WebElement men = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));
			Actions act = new Actions(driver);
			act.moveToElement(men).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Fossil']")).click();
			Thread.sleep(5000);
			 
			Scanner scan = new Scanner(System.in);
					
					
			List<WebElement> count = driver.findElements(By.xpath("//a[@class='_2Xp0TH']"));
			int s = count.size();
			System.out.println(s);
			System.out.println("Enter your pagenum: ");
			int in = scan.nextInt();
			in=in-1;
			for(int i=0; i<s; i++) {
				if(i==in) {
					driver.findElement(By.xpath("//a[@class='_2Xp0TH']["+ i +"]")).click();
					Thread.sleep(5000);
				}
				
			}
			
	}
			
	public static void product1() {
		String key1 = null;
		String value11 = null;
				
				List<WebElement> product = driver.findElements(By.xpath("//a[@class='_2mylT6']" ));
				int size = product.size();
				System.out.println(size);
				for(int i=0;i<size; i++) {
				key1 = (product.get(i).getText());
				for (int j = i; j <=i; j++) {
					List<WebElement> prize1 = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
					int size1 = prize1.size();
					 value11 = (prize1.get(i).getText());
					//System.out.println(value11);
					}
				//System.out.println(key1 + value11);
				Map<String, String> m = new HashMap<String, String>();
				m.put(key1, value11);
				Set<Entry<String, String>> entry = m.entrySet();
				for (Entry<String, String> x : entry) {
					System.out.println(x);
					
				}
				}
				
			}
			/*public static String prize() {
				String value1=null;
			
				List<WebElement> prize1 = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
				int size1 = prize1.size();
				System.out.println(size1);
				for(int i=0; i<size1; i++) {
					String value11 = (prize1.get(i).getText());
					System.out.println(value11);
				}
				return value1;
			}*/
			
			
			
			public static void selectedwatch() throws InterruptedException {
			List<WebElement> watchlist = driver.findElements(By.xpath("//img[@class='_3togXc']"));
			int list = watchlist.size();
			for(int i=0; i<list; i++) {
				if(i==3) {
					WebElement web = driver.findElement(By.xpath("(//img[@class='_3togXc'])["+ i +"]"));
					web.click();
					Thread.sleep(5000);
					Set<String> childwindw = driver.getWindowHandles();
					System.out.println(childwindw);
					List<String> lis = new ArrayList<String>();
					lis.addAll(childwindw);
					driver.switchTo().window((lis.get(lis.size()-1)));
					WebElement productname = driver.findElement(By.xpath("//span[@class='_35KyD6']"));
					System.out.println(productname.getText());
					WebElement productprize = driver.findElement(By.xpath("//div[@class='_1vC4OE _3qQ9m1']"));
					System.out.println(productprize.getText());
							
						}
					
					}
				}
			
			
			
			
			
			
			
			
	
	public static void main(String[] args) throws InterruptedException {
		flip();		
		product1();
		
		selectedwatch();
	}

}




