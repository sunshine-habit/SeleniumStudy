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
		System.out.println("ģ��һ����֤���ʵ���߼�");
		int min = 1000;
		int max = 9999;
		//����һ��Math.random() ��������[0, 1)��Χ�ڵ�double�����������
		
		//Random���е�nextXxxxϵ�з�������0��n���������
		
		for(int i =1; i<=10; i++){
		
		int num=	(int)(Math.random()*1000+1000);
		String beforeCode=String.valueOf(num);
		System.out.println("����Ҫ�������֤���ǣ�"+beforeCode);
		
		//�����������
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("�����������֤��");
			String code = scanner.nextLine();
			//�˴�������==�����������������õ�ͬһ����ַ
			if(beforeCode.equals(code)){
				System.out.println("������֤����ȷ��");
				break;
			}
			else{
				System.out.println("����������~");
				if(i == 10){
					System.out.println("������Ĵ������࣬�˺ű�������");
				}
			}
		}
		//��֤���߼�����
		
		//��¼cookie���ܿ���֤��
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
		//���ַ�ʽ������������δ��������cookie ���ҵ��û����������Ӧ��key ֵ�����������Ӧ�ĵ�¼��Ϣ��
		//������getCookies()��������ȡ��¼�����е�cookie ��Ϣ�������ҵ��û����������key��
		//��Ȼ����ֱ�ӵķ�ʽ��ѯ�ʿ�����Ա��
		System.out.println(driver.manage().getCookies());
		Cookie c1= new Cookie("mail_uid","goodmoring@126.com");
		driver.manage().addCookie(c1);
		
		System.out.println(driver.manage().getCookies());
		driver.findElement(By.linkText("�˳�")).click();
		
		driver.quit();
	}

}
