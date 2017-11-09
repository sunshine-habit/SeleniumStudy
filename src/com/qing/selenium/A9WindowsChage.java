package com.qing.selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.*;

public class A9WindowsChage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.out.println("多窗口切换");
			
			//打开浏览器
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.baidu.com");
			//获得当前窗口句柄
			String baidu_handle = driver.getWindowHandle();
			System.out.println("当前窗口句柄是："+baidu_handle);
			driver.findElement(By.linkText("登录")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("pass-reglink")).click();
			
			//获得所有窗口句柄
			//Set 和 List 两个接口都是继承自Collection. 
			Set<String> handles = driver.getWindowHandles();
			//判断是否为注册窗口，并操作注册窗口的元素
			for(String handle : handles){
				if(handle.equals(baidu_handle) == false){
					//切换到注册窗口
					driver.switchTo().window(handle);
					System.out.println("你现在在注册页面哦");
					driver.findElement(By.id("TANGRAM__PSP_3__userName")).sendKeys("helloworld");
					driver.findElement(By.id("TANGRAM__PSP_3__phone")).sendKeys("16688888887");
					driver.findElement(By.id("TANGRAM__PSP_3__verifyCode")).sendKeys("verifyCode");
					driver.findElement(By.id("TANGRAM__PSP_3__password")).sendKeys("password");
					Thread.sleep(5000);
					//关闭当前页面
					driver.close();
					System.out.println("注册页面关闭了~");
				}
			}
			
				//切换到百度首页
				for(String handle : handles){
					if(handle.equals(baidu_handle)){	
						driver.switchTo().window(handle);
						//关闭弹层
						driver.findElement(By.id("TANGRAM__PSP_4__closeBtn")).click();
						driver.findElement(By.id("kw")).sendKeys("世界，你好！");
					}
					Thread.sleep(3000);
				}
				driver.close();		
			
			System.out.println("game over~ again!");
	}

}
