package com.seleniumpractice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public WebDriver driver;
    @Test
    public void screenShot() throws IOException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File SFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File DFile = new File("H:\\CFP251\\Automation\\Screenshot\\screenshot1.png");
        FileHandler.copy(SFile,DFile);
    }
}
