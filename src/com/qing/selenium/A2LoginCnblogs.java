package com.qing.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.Dimension;

public class A2LoginCnblogs {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.out.println("博客园，控制浏览器");
		System.out.println("设置浏览器大小，返回到上一页面、后退");
		
/*		System.setProperty("webdriver.firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("selenium java");
		driver.findElement(By.id("su"));		
		driver.close();*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//修改浏览器尺寸
		driver.manage().window().setSize(new Dimension(1480,800));
		driver.get("https://passport.cnblogs.com/user/signin?ReturnUrl=https%3A%2F%2Fwww.cnblogs.com%2F");
				
		driver.findElement(By.id("input1")).sendKeys("liuyaqing1988");
		driver.findElement(By.id("input2")).sendKeys("selenium88!");
		
		//在方方法名处抛出异常，则不需要try catch了,后面学了元素等待，页面加载时间、定位对象时间
		Thread.sleep(2000);
		driver.findElement(By.id("signin")).click();
			
		Thread.sleep(8000);	
		//driver.findElement(By.className("search_input")).sendKeys("good");
		driver.findElement(By.linkText("园子")).click();
		
		//点击我的博客
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='header_user_right']/a[3]")).click();
		
		Thread.sleep(1000);
		System.out.println("返回到上一页面，后退按钮");
		driver.navigate().back();
		
		Thread.sleep(1000);
		System.out.println("前进按钮");
		driver.navigate().forward();

		Thread.sleep(1000);
		driver.close();
		
		
		/*WebDriver driver = new InternetExplorerDriver();*/
		
		System.out.println("game over~ again!");
		
	}

}
