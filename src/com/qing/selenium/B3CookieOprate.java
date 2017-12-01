package com.qing.selenium;

import java.util.Set;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;



public class B3CookieOprate {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("操作Cookie");
		//打开浏览器
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://126.com/");
		Thread.sleep(1000);
		
		//get cookie infomation
		//cookie是一组数据，需要放在一个集合里哦
		//Set 无序集合，不重复；List 有序列表，可以重复；Map 映射，键值对
		Set<Cookie> coo = driver.manage().getCookies();
		//print the cookies
		System.out.println("打开网页查看cookie：");
		System.out.println(coo);
		Thread.sleep(1000);
		
		//删除所有cookie
		driver.manage().deleteAllCookies();
		Set<Cookie> coo2 = driver.manage().getCookies();
		System.out.println("删除cookie后查看cookie：");
		System.out.println(coo2);
		
		//添加cookie
		Cookie cookieNew = new Cookie("name", "sunshine");
		Cookie cookieNew1= new Cookie("pwd", "secret");
		driver.manage().addCookie(cookieNew);
		driver.manage().addCookie(cookieNew1);
		
		Set<Cookie> coo3 = driver.manage().getCookies();
		System.out.println("添加新cookie后查看：");
		System.out.println(coo3);
		
		//登录
		driver.switchTo().frame("x-URS-iframe");
		//driver.findElement(By.id("lbNormal")).click();
		driver.findElement(By.name("email")).sendKeys("liuyaqing1988");
		//driver.findElement(By.name("email")).clear();
    	driver.findElement(By.name("password")).sendKeys("selenium");   
    	Thread.sleep(3000);
		driver.findElement(By.id("dologin")).click();
		Thread.sleep(3000);
		//查看登录后cookie
		Set<Cookie> coo4 = driver.manage().getCookies();
		driver.manage().deleteCookieNamed("df");
		System.out.println("登录后查看cookie：");
		System.out.println(coo4);
		
		//关闭所有窗口，并且安全关闭session
		driver.quit();
		
		System.out.println("game over~ again!");
	}
}
