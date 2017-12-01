package com.qing.selenium;

import java.util.Random;
import java.util.Scanner;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B7RandomTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("模拟一下验证码的实现逻辑");
		int min = 1000;
		int max = 9999;
		//方法一：Math.random() 方法生成[0, 1)范围内的double类型随机数；
		
		//Random类中的nextXxxx系列方法生成0－n的随机数；
		
		for(int i =1; i<=10; i++){
		
		int num=	(int)(Math.random()*1000+1000);
		String beforeCode=String.valueOf(num);
		System.out.println("您将要输入的验证码是："+beforeCode);
		
		//创建输入对象
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入随机验证：");
			String code = scanner.nextLine();
			//此处不能用==，代表两个变量引用的同一个地址
			if(beforeCode.equals(code)){
				System.out.println("输入验证码正确！");
				break;
			}
			else{
				System.out.println("请重新输入~");
				if(i == 10){
					System.out.println("你输入的次数过多，账号被锁定！");
				}
			}
		}
		//验证码逻辑结束
		
		//记录cookie，避开验证码
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.126.com/");
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("x-URS-iframe");
		//driver.findElement(By.id("lbNormal")).click();
		driver.findElement(By.name("email")).sendKeys("liuyaqing1988");
		//driver.findElement(By.name("email")).clear();
    	driver.findElement(By.name("password")).sendKeys("selenium");   
    	
    	Thread.sleep(3000);
		
    	
    	driver.findElement(By.id("dologin")).click();
		Thread.sleep(3000);
		//这种方式最大的问题是如何从浏览器的cookie 中找到用户名和密码对应的key 值，并传输入对应的登录信息。
		//可以用getCookies()方法来获取登录的所有的cookie 信息，从中找到用户名和密码的key。
		//当然，更直接的方式是询问开发人员。
		System.out.println(driver.manage().getCookies());
		Cookie c1= new Cookie("mail_uid","goodmoring@126.com");
		driver.manage().addCookie(c1);
		
		System.out.println(driver.manage().getCookies());
		driver.findElement(By.linkText("退出")).click();
		
		driver.quit();
	}

}
