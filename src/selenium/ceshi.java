package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ceshi {
      public static void main(String[] args) throws Exception {
            //指定浏览器驱动路径
            String chromePath = "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe";
            //设置指定键对值的系统属性
            System.setProperty("webdriver.chrome.driver", chromePath);
            //创建驱动对象
            WebDriver driver = new ChromeDriver();
            //获取网址
            driver.get("http://www.baidu.com");
            //线程睡眠3秒（目的是等待浏览器打开完成）
            Thread.sleep(3000);
            //获取百度搜索输入框元素，并自动写入搜索内容
            driver.findElement(By.id("kw")).sendKeys("selenium");
            //线程睡眠1秒
            Thread.sleep(1000);
            //获取“百度一下”元素，并自动点击
            driver.findElement(By.id("su")).click();
            //线程睡眠3秒
            Thread.sleep(3000);
            //退出浏览器
            driver.quit();
      }

}