package com.qing.selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.util.List;


public class A8ElementsLocation {

	public static void main(String[] args) throws 	InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("***********定位一组元素***********");
		System.out.println("*******要么打开Hbuilder*********");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\liu_y\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//String url="http://127.0.0.1:8020/gitHub_helloworld/HTMLCSS/Day3/leesson/form.html";
		File file = new File( "E:/GIT/HtmlCssStudy/Day3/leesson/form.html");
		String url = file.getAbsolutePath();
		//下面的方法也可以用，本地路径就用上面的吧
		//String url ="E:/gitHub_helloworld/HTMLCSS/Day3/leesson/form.html";
		driver.get(url);
		//list 数组，找到一组标签名为input的元素
		List<WebElement>  inputs = driver.findElements(By.tagName("input"));
		//循环遍历数组
		for(WebElement checkbox : inputs){
			//checkbox其中某一个元素，getAttribut("type")获取type属性的值；
			String type = new String(checkbox.getAttribute("type"));
			if (type.equals("radio")){
			checkbox.click();
			Thread.sleep(1000);
			}
			}
		
		
			//通过css 找到一组元素
			//List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=checkbox]"));
			//通过xpath 找到一组元素
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(checkboxes.size());
			
			for(WebElement checkbox : checkboxes) {
			checkbox.click();
			}
			//最后一个复选框点击
			checkboxes.get(checkboxes.size() - 1).click();
			Thread.sleep(3000);
			
			
			driver.navigate().refresh();
			
			Thread.sleep(3000);
			driver.close();
			
			System.out.println("game over~ again!");
	}

}
