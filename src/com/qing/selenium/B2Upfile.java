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
					System.out.println("�ϴ��ļ�");
					
					System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();

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
								
			
					
	
					Thread.sleep(4000);
					
					//���Ǹ����ߣ����Ԫ���Ҳ������������������Ƿ���false
					if( WebElementExist(driver,"tip-button")){
						System.out.println("true");
						driver.findElement(By.className("tip-button")).click();
					}else{
						System.out.println("false");
					}
					//������ʹ�ø������������������пո�
					
					//driver.findElement(By.className("tip-button")).click();
					
					
					//�ϴ��ļ�
					File file = new File("E:\\abc.txt");
					String filePath= file.toString();
					driver.findElement(By.id("h5Input0")).sendKeys(filePath);
					Thread.sleep(15000);
					
					//�����ļ�
					System.out.println("������ѧϰ��");
					
					//driver.close();
					
					System.out.println("game over~ again!");
					
					

	}
	
	//�ж�һ��Ԫ���Ƿ���ڣ�����������������
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

