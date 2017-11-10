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
		
		System.out.println("����л�");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		File file = new File("E:/GIT/HtmlCssStudy/Day2/lesson/frameset.html");
		String filePath= file.getAbsolutePath();
		System.out.println(filePath);
		driver.get(filePath);
		
		//��λ�����frame����
		driver.switchTo().frame("left");
		driver.findElement(By.linkText("�ٶ�")).click();
		
		//��������Ĭ�ϵĵ�ǰҳ��
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//��λ���Ҳ�frame����
		driver.switchTo().frame("right");
		driver.findElement(By.id("kw")).sendKeys("�������Ҳ�iframe�������ѯ������");
		
		driver.close();
		System.out.println("game over~ again!");
	}

}
