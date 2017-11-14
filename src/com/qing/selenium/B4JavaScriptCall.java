package com.qing.selenium;
import org.openqa.selenium.chrome.*;

import com.gargoylesoftware.htmlunit.javascript.configuration.JavaScriptConfiguration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;


public class B4JavaScriptCall {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("JavaScript调用");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(700, 600));
		driver.get("http://www.baidu.com");
		
		driver.findElement(By.id("kw")).sendKeys("Selenium");
		driver.findElement(By.id("kw")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		
		//将页面滚动条拖动，所有的JS脚本中以执行哦
		//方法一：
		((JavascriptExecutor)driver).executeScript("window.scrollTo(100,800);");
		Thread.sleep(2000);
		//方法二：
		String js="window.scrollTo(50,500);";
		 ((JavascriptExecutor)driver).executeScript(js);

		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("game over~ again!");
		

	}

}
