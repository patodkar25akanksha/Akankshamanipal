package org.example;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    @Test
    public void ss () throws IOException {

        System.setProperty("web-driver.chrome.driver", "C:\\Users\\Akanksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Files.copy(screenshot , new File("C:\\Users\\Akanksha\\Desktop\\image1.jpg"));








    }
}
