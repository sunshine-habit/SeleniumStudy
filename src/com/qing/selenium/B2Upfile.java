package com.qing.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;

public class B2Upfile {

	public static void main(String[] args)  throws  InterruptedException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
					System.out.println("����¼�");
					
					System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					//iE************************
					/*System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
					DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			    	WebDriver driver = new InternetExplorerDriver(ieCapabilities);*/
					
					//System.setProperty("webdriver.firefox.bin","E:\\Program Files\\Mozilla Firefox\\firefox-sdk\\bin\\firefox.exe");
					//WebDriver driver = new FirefoxDriver();
					   
			        
				    driver.get("http://pan.baidu.com");
					Actions action = new Actions(driver);
					
					driver.manage().window().setSize(new Dimension(1200,800));
					
					action.doubleClick(driver.findElement(By.className("account-title"))).perform();

					//driver.findElement(By.className("account-title")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.name("userName")).clear();
					//ע���˸��ºţ�selenium88
					driver.findElement(By.name("userName")).sendKeys("selenium88");
					driver.findElement(By.name("password")).clear();
					driver.findElement(By.name("password")).sendKeys("selenium");
					//��Ҫ����ʱ��������֤��
					Thread.sleep(5000);
					
					driver.findElement(By.id("TANGRAM__PSP_4__submit")).click();
					//��ʼѧ����¼�
					Thread.sleep(10000);
					
					//����
					//driver.findElement(By.id("h5Input0")).click();
								
					
					File file = new File("E:\\abc.txt");
					String filePath= file.toString();
					driver.findElement(By.id("h5Input0")).sendKeys(filePath);
					Thread.sleep(5000);
					
					
					//driver.close();
					
					
					System.out.println("game over~ again!");

	}

}
