package test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.selenium.common.env;

public class test {
	public static void main(String[] args) {
		env.setChromePath();
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.baidu.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.quit();
	}
}
