package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

@Test
    public static void winhandle() {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akanksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        // maximize the window
        driver.manage().window().maximize();

        String parentwindow = driver.getWindowHandle();
        System.out.println(parentwindow);

        WebElement newtab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newtab.click();

        // get handles of the windows

        Set<String> allwindowhandles = driver.getWindowHandles();
        Iterator<String> iterator = allwindowhandles.iterator();

        // check whether child window is not equal to parent window

        while(iterator.hasNext()){

            String Childwindow  = iterator.next();
            if(!parentwindow.equalsIgnoreCase(Childwindow)){
                driver.switchTo().window(Childwindow);

                String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
                System.out.println(text);
                driver.close();

            }
            // switch back to the parent window
          //  driver.switchTo().defaultContent();
        }










    }
}
