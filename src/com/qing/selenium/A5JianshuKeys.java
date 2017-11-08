package com.qing.selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;


public class A5JianshuKeys {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.print("现在开始登录简书网~");
		System.out.print("键盘事件~");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver2 = new FirefoxDriver();
		driver.get("http://www.jianshu.com/");
		driver.manage().window().setSize(new Dimension(1200,800));
		driver.findElement(By.linkText("登录")).click();
		//driver.findElement(By.name("email")).clear();
		driver.findElement(By.id("session_email_or_mobile_number")).sendKeys("liuyaqing1988@126.com");
		driver.findElement(By.id("session_password")).sendKeys("selenium");
		
			Thread.sleep(12000);
		
		driver.findElement(By.name("commit")).click();
		WebElement input = driver.findElement(By.id("q"));
		input.sendKeys("selenium");
		input.sendKeys(Keys.BACK_SPACE);
		input.sendKeys(Keys.SPACE);
		Thread.sleep(15000);
		input.sendKeys("Java");
		input.sendKeys(Keys.CONTROL,"a");
		input.sendKeys(Keys.CONTROL,"c");
		input.sendKeys(Keys.CONTROL,"v");
		input.sendKeys(Keys.CONTROL,"v");
		input.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.close();
		
		//想想怎么解决两个页面都关闭的
		
		
		System.out.println("game over~ again!");
		}
}
