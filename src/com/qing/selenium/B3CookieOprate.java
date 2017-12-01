package com.qing.selenium;

import java.util.Set;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;



public class B3CookieOprate {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("����Cookie");
		//�������
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://126.com/");
		Thread.sleep(1000);
		
		//get cookie infomation
		//cookie��һ�����ݣ���Ҫ����һ��������Ŷ
		//Set ���򼯺ϣ����ظ���List �����б������ظ���Map ӳ�䣬��ֵ��
		Set<Cookie> coo = driver.manage().getCookies();
		//print the cookies
		System.out.println("����ҳ�鿴cookie��");
		System.out.println(coo);
		Thread.sleep(1000);
		
		//ɾ������cookie
		driver.manage().deleteAllCookies();
		Set<Cookie> coo2 = driver.manage().getCookies();
		System.out.println("ɾ��cookie��鿴cookie��");
		System.out.println(coo2);
		
		//���cookie
		Cookie cookieNew = new Cookie("name", "sunshine");
		Cookie cookieNew1= new Cookie("pwd", "secret");
		driver.manage().addCookie(cookieNew);
		driver.manage().addCookie(cookieNew1);
		
		Set<Cookie> coo3 = driver.manage().getCookies();
		System.out.println("�����cookie��鿴��");
		System.out.println(coo3);
		
		//��¼
		driver.switchTo().frame("x-URS-iframe");
		//driver.findElement(By.id("lbNormal")).click();
		driver.findElement(By.name("email")).sendKeys("liuyaqing1988");
		//driver.findElement(By.name("email")).clear();
    	driver.findElement(By.name("password")).sendKeys("selenium");   
    	Thread.sleep(3000);
		driver.findElement(By.id("dologin")).click();
		Thread.sleep(3000);
		//�鿴��¼��cookie
		Set<Cookie> coo4 = driver.manage().getCookies();
		driver.manage().deleteCookieNamed("df");
		System.out.println("��¼��鿴cookie��");
		System.out.println(coo4);
		
		//�ر����д��ڣ����Ұ�ȫ�ر�session
		driver.quit();
		
		System.out.println("game over~ again!");
	}
}
