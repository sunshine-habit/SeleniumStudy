package com.qing.selenium;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class B5HTML5Video {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("����HTML5 ����Ƶ���ţ��ðɣ����ִ��ʧ�ܣ�û���ҵ�ԭ�򡣡��������о�");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://videojs.com/");
		
		driver.findElement(By.id("preview-player")).click();
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//���������URL
//		jse.executeScript("return arguments[0].currentSrc;",video);
		//��������������15 ����
//		jse.executeScript("arguments[0].play()", video);
		Thread.sleep(15000);
		
		//��ͣ����
//		jse.executeScript("arguments[0].pause()", video);
//		driver.quit();
		
		driver.quit();
		System.out.println("Exec failure");
	}

}
