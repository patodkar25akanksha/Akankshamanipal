package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchfirefox {

    @Test
    public  void firefox() {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akanksha\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/login/");


    }
}
