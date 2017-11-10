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
		System.out.println("警告框处理");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		File file = new File("E:/GIT/JavaScriptStudy/tankuang.html");
		String filePath =file.getAbsolutePath();
		driver.get(filePath);
		
		//ALERT弹框测试
		driver.findElement(By.linkText("alert弹框")).click();
		Thread.sleep(2000);
		System.out.println("弹alert框");
		
		Alert alert = driver.switchTo().alert();
		String s=alert.getText();
		System.out.println("弹框内容是："+s);
		System.out.println("关闭弹框");
		alert.accept();
		//hava a reast 
		Thread.sleep(3000);
		
		//confirm弹框测试
		driver.findElement(By.linkText("confirm弹框")).click();
		Thread.sleep(2000);
		System.out.println("弹confirm框");
		
		Alert confirm =driver.switchTo().alert();
		String confirmContent = confirm.getText();
		System.out.println(confirmContent);
		System.out.println("关闭弹框");
		//我很幸福
		alert.accept();
		//have a nice day,take a break
		alert.accept();
		Thread.sleep(2000);
		
		//prompt弹框
		driver.findElement(By.linkText("prompt弹框")).click();
		Thread.sleep(1000);
		System.out.println("弹prompt框");
		Alert prompt =  driver.switchTo().alert();
		String promptContent = prompt.getText();
		//输入个正确答案呗，有点小问题，弹框输入值了居然不显示
		prompt.sendKeys("3");
		Thread.sleep(2000);
		prompt.accept();
		//告诉你答案是否正确
		Thread.sleep(2000);
		prompt.accept();
		
		driver.close();
		
		System.out.println("game over~ again!");
	}

}
