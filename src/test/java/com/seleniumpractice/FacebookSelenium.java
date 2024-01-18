package com.seleniumpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;


public class FacebookSelenium {
    public WebDriver driver;
    @Test
    public void login() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
//        String facebookTitle = driver.getTitle();
//        System.out.println(facebookTitle);
//        String facebookPageSource = driver.getPageSource();
//        System.out.println(facebookPageSource);
//        String currentURL = driver.getCurrentUrl();
//        System.out.println(currentURL);
//        String getWindowHandle = driver.getWindowHandle();
//        System.out.println(getWindowHandle);
//        Thread.sleep(5000);
//        driver.navigate().to("https://www.flipkart.com/");
//        driver.navigate().back();
//        Thread.sleep(5000);
//        driver.navigate().forward();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        driver.close();
//        driver.quit();
        driver.findElement(By.id("email")).sendKeys("rakp6505@gmail.com");
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#email")).sendKeys("rakp6505@gmail.com");
//        Thread.sleep(2000);
        WebElement element = driver.findElement(By.name("pass"));
        element.sendKeys("rakesh65");
        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rakesh65");
//        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
//        driver.findElement(By.cssSelector("input[type='login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class=x1lliihq x6ikm8r x10wlt62 x1n2onr6]")).sendKeys("Hi, I am Rakesh");

//        driver.navigate().back();
//        Thread.sleep(5000);
    }
    @Test
    public void createNewAccount() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Rakesh");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Kumar");
        Thread.sleep(5000);
        driver.findElement(By.name("reg_email__")).sendKeys("rakp6505@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rakp6505@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("rakesh65");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_day")).sendKeys("25");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("10");
        Thread.sleep(5000);
        driver.findElement(By.name("birthday_year")).sendKeys("2001");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        driver.findElement(By.linkText("No, Create New Account")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Continue")).click();
        Thread.sleep(5000);
    }

}
