package com.qing.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.util.NoSuchElementException;

public class B2Upfile {

	public static void main(String[] args)  throws  InterruptedException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
					System.out.println("上传文件");
					
					System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					driver.get("http://pan.baidu.com");
					Actions action = new Actions(driver);
					
					driver.manage().window().setSize(new Dimension(1200,800));
					
					action.doubleClick(driver.findElement(By.className("account-title"))).perform();

					//driver.findElement(By.className("account-title")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.name("userName")).clear();
					//注册了个新号：selenium88
					driver.findElement(By.name("userName")).sendKeys("selenium88");
					driver.findElement(By.name("password")).clear();
					driver.findElement(By.name("password")).sendKeys("selenium");
					//需要留出时间输入验证码
					Thread.sleep(5000);
					
					driver.findElement(By.id("TANGRAM__PSP_4__submit")).click();
					//开始学鼠标事件
					Thread.sleep(10000);
					
					//单击
					//driver.findElement(By.id("h5Input0")).click();
								
			
					
	
					Thread.sleep(4000);
					
					//这是个鸡肋，如果元素找不到，照样报错，而不是返回false
					if( WebElementExist(driver,"tip-button")){
						System.out.println("true");
						driver.findElement(By.className("tip-button")).click();
					}else{
						System.out.println("false");
					}
					//不允许使用复合类名做参数，即有空格
					
					//driver.findElement(By.className("tip-button")).click();
					
					
					//上传文件
					File file = new File("E:\\abc.txt");
					String filePath= file.toString();
					driver.findElement(By.id("h5Input0")).sendKeys(filePath);
					Thread.sleep(15000);
					
					//下载文件
					System.out.println("后期再学习吧");
					
					//driver.close();
					
					System.out.println("game over~ again!");
					
					

	}
	
	//判断一个元素是否存在，这个方法是有问题的
	public static  boolean WebElementExist (WebDriver driver1,String content){
		try 
        { 	 
				//System.out.println("here");
               driver1.findElement(By.className(content)); 
               return true; 
        } 
        catch (NoSuchElementException e) 
        { 
                return false; 
        } 
	}

}

