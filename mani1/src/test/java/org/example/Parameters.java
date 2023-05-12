package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameters {

    @Test
    @org.testng.annotations.Parameters("browser")
    public void testparameters(String browser){

        if(browser.equals("chrome")){

            System.out.println("Opening chrome browser");
            System.setProperty("web-driver.chrome.driver", "C:\\Users\\Akanksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");

        }else {

            System.setProperty("web-driver.chrome.driver", "C:\\Users\\Akanksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");

            driver.close();
        }



    }
}
