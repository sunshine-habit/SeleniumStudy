package com.qing.selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class A7CsdnWaitElement {
		public static void main(String[]  args) throws InterruptedException{
			System.out.print("****************����Ԫ�صȴ������������Ŷ************");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://passport.csdn.net/account/login?from=http://my.csdn.net/my/mycsdn");
			driver.manage().window().setSize(new Dimension(1300,900));
		
			//ҳ����س�ʱʱ������Ϊ3s��������ʹ�ã����Եȴ���
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			//��λ����ʱ��10s ��ʱ��, ���10s �ڻ���λ�������׳��쳣��������ʹ�ã����Եȴ���
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			//�첽�ű��ĳ�ʱʱ�����ó�3s��������ʹ�ã����Եȴ���
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("username")).clear();
			//
			driver.findElement(By.id("username")).sendKeys("liuyaqing1988@126.com");
			driver.findElement(By.id("password")).clear();
			
			
			System.out.println("��������ȷ������");
			Scanner scanner = new Scanner(System.in);
			String pwd = scanner.nextLine();
			driver.findElement(By.id("password")).sendKeys(pwd);
		
			driver.findElement(By.className(	"logging")).click();
			
			Hello hello = new Hello();
			hello.sayhi();
			
			
			driver.findElement(By.linkText("�����ʴ�")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("ask_tips_box")).click();
			driver.findElement(By.xpath("//*[@id='askInputSecond']"));
			
			
			System.out.println("Game is over~");
			System.out.println("game over~ again!");
					
		}
	
}

 class Hello{
	public  void sayhi(){
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.baidu.com");
		//�������û��throw�쳣����ô�Ͳ����쳣����
		//��Ҫ������ط�Ҫ�Ѱٶ����������ص�����籨��
		System.out.println("����ٶȳ����ˣ���ô�͹ص��ɣ�Ҫ��Ȼ����Ŷ����ûѧϰ�л�������");
		try{
			//ǿ�Ƶȴ���������ʹ��
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("hi");
	}
}
