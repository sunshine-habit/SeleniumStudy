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
			System.out.println("�ര���л�");
			
			//�������
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.baidu.com");
			//��õ�ǰ���ھ��
			String baidu_handle = driver.getWindowHandle();
			System.out.println("��ǰ���ھ���ǣ�"+baidu_handle);
			driver.findElement(By.linkText("��¼")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("pass-reglink")).click();
			
			//������д��ھ��
			//Set �� List �����ӿڶ��Ǽ̳���Collection. 
			Set<String> handles = driver.getWindowHandles();
			//�ж��Ƿ�Ϊע�ᴰ�ڣ�������ע�ᴰ�ڵ�Ԫ��
			for(String handle : handles){
				if(handle.equals(baidu_handle) == false){
					//�л���ע�ᴰ��
					driver.switchTo().window(handle);
					System.out.println("��������ע��ҳ��Ŷ");
					driver.findElement(By.id("TANGRAM__PSP_3__userName")).sendKeys("helloworld");
					driver.findElement(By.id("TANGRAM__PSP_3__phone")).sendKeys("16688888887");
					driver.findElement(By.id("TANGRAM__PSP_3__verifyCode")).sendKeys("verifyCode");
					driver.findElement(By.id("TANGRAM__PSP_3__password")).sendKeys("password");
					Thread.sleep(5000);
					//�رյ�ǰҳ��
					driver.close();
					System.out.println("ע��ҳ��ر���~");
				}
			}
			
				//�л����ٶ���ҳ
				for(String handle : handles){
					if(handle.equals(baidu_handle)){	
						driver.switchTo().window(handle);
						//�رյ���
						driver.findElement(By.id("TANGRAM__PSP_4__closeBtn")).click();
						driver.findElement(By.id("kw")).sendKeys("���磬��ã�");
					}
					Thread.sleep(3000);
				}
				driver.close();		
			
			System.out.println("game over~ again!");
	}

}
