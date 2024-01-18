package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AutoITFile {
    public WebDriver driver;
@Test
    public  void fileUpload() throws InterruptedException, IOException {
        driver=new ChromeDriver();
        driver.get("https://www.ilovepdf.com/compress_pdf");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='pickfiles']/span")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("H:\\CFP251\\AutoIt\\file.exe");
        Thread.sleep(2000);
    }
}
