package com.qing.selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import java.util.concurrent.TimeUnit;


public class A7CsdnWaitElement {
		public static void main(String[]  args) throws InterruptedException{
			System.out.print("****************设置元素等待，这个有问题哦************");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://passport.csdn.net/account/login?from=http://my.csdn.net/my/mycsdn");
			driver.manage().window().setSize(new Dimension(1300,900));
		
			//页面加载超时时间设置为3s
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			//定位对象时给10s 的时间, 如果10s 内还定位不到则抛出异常
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			//异步脚本的超时时间设置成3s
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("username")).clear();
			//
			driver.findElement(By.id("username")).sendKeys("liuyaqing1988@126.com");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("liuyaqing1020");
		
			driver.findElement(By.className(	"logging")).click();
			
			Hello hello = new Hello();
			hello.sayhi();
			
			
			driver.findElement(By.linkText("技术问答")).click();
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
		//如果函数没有throw异常，那么就捕获异常！！
		//重要在这个地方要把百度这个浏览器关掉，否岀报错
		System.out.println("如果百度出来了，那么就关掉吧，要不然报错哦，还没学习切换窗口呢");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("hi");
	}
}
