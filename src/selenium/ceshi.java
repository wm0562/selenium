package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ceshi {
      public static void main(String[] args) throws Exception {
            //ָ�����������·��
            String chromePath = "C://Program Files (x86)//Google//Chrome//Application//chromedriver.exe";
            //����ָ������ֵ��ϵͳ����
            System.setProperty("webdriver.chrome.driver", chromePath);
            //������������
            WebDriver driver = new ChromeDriver();
            //��ȡ��ַ
            driver.get("http://www.baidu.com");
            //�߳�˯��3�루Ŀ���ǵȴ����������ɣ�
            Thread.sleep(3000);
            //��ȡ�ٶ����������Ԫ�أ����Զ�д����������
            driver.findElement(By.id("kw")).sendKeys("selenium");
            //�߳�˯��1��
            Thread.sleep(1000);
            //��ȡ���ٶ�һ�¡�Ԫ�أ����Զ����
            driver.findElement(By.id("su")).click();
            //�߳�˯��3��
            Thread.sleep(3000);
            //�˳������
            driver.quit();
      }

}