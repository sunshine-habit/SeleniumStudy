package com.qing.selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import java.io.File;

public class B1Tankuang {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("�������");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		File file = new File("E:/GIT/JavaScriptStudy/tankuang.html");
		String filePath =file.getAbsolutePath();
		driver.get(filePath);
		
		//ALERT�������
		driver.findElement(By.linkText("alert����")).click();
		Thread.sleep(2000);
		System.out.println("��alert��");
		
		Alert alert = driver.switchTo().alert();
		String s=alert.getText();
		System.out.println("���������ǣ�"+s);
		System.out.println("�رյ���");
		alert.accept();
		//hava a reast 
		Thread.sleep(3000);
		
		//confirm�������
		driver.findElement(By.linkText("confirm����")).click();
		Thread.sleep(2000);
		System.out.println("��confirm��");
		
		Alert confirm =driver.switchTo().alert();
		String confirmContent = confirm.getText();
		System.out.println(confirmContent);
		System.out.println("�رյ���");
		//�Һ��Ҹ�
		alert.accept();
		//have a nice day,take a break
		alert.accept();
		Thread.sleep(2000);
		
		//prompt����
		driver.findElement(By.linkText("prompt����")).click();
		Thread.sleep(1000);
		System.out.println("��prompt��");
		Alert prompt =  driver.switchTo().alert();
		String promptContent = prompt.getText();
		//�������ȷ���£��е�С���⣬��������ֵ�˾�Ȼ����ʾ
		prompt.sendKeys("3");
		Thread.sleep(2000);
		prompt.accept();
		//��������Ƿ���ȷ
		Thread.sleep(2000);
		prompt.accept();
		
		driver.close();
		
		System.out.println("game over~ again!");
	}

}
