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
		System.out.println("屏幕截图");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.oschina.net/");
		
		//执行getScreenshotAs()对当前窗口进行截图，这里需要指定图片的保存路径及文件名
		System.out.println("只是截取了当前窗口显示内容的图片~");
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
