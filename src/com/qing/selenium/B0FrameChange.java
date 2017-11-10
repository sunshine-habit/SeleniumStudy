package com.qing.selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import java.io.File;


public class B0FrameChange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("多表单切换");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		File file = new File("E:/GIT/HtmlCssStudy/Day2/lesson/frameset.html");
		String filePath= file.getAbsolutePath();
		System.out.println(filePath);
		driver.get(filePath);
		
		//定位到左侧frame框中
		driver.switchTo().frame("left");
		driver.findElement(By.linkText("百度")).click();
		
		//跳出表单到默认的当前页面
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//定位到右侧frame框中
		driver.switchTo().frame("right");
		driver.findElement(By.id("kw")).sendKeys("你跳到右侧iframe框输入查询内容了");
		
		driver.close();
		System.out.println("game over~ again!");
	}

}
