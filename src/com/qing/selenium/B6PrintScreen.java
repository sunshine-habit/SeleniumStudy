package com.qing.selenium;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6PrintScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��Ļ��ͼ");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.oschina.net/");
		
		//ִ��getScreenshotAs()�Ե�ǰ���ڽ��н�ͼ��������Ҫָ��ͼƬ�ı���·�����ļ���
		System.out.println("ֻ�ǽ�ȡ�˵�ǰ������ʾ���ݵ�ͼƬ~");
		try{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile( srcFile , new File("E:\\screenshot.png"));

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		driver.quit();		
		System.out.println("game over~ again!");
	}
		

}
