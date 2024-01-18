package com.youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YoutubePage {
    public WebDriver driver;
    @Test
    public void getYoutubePage(){
        driver =new ChromeDriver();
        //open youtube page
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void getPageTitle(){
        driver =new ChromeDriver();
        //open youtube page
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        //get page title
        String title=driver.getTitle();
        System.out.println("Page title : "+title);
        driver.close();
    }
    @Test
    public void getYoutubePageSource(){
        driver =new ChromeDriver();
        //open youtube page
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        //get page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }
    @Test
    public void getCurrentPageUrl(){
        driver =new ChromeDriver();
        //open youtube page
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        //get current page url
        String currentPageUrl = driver.getCurrentUrl();
        System.out.println("Current url : "+currentPageUrl);
        driver.close();
    }
    @Test
    public void navigate(){
        driver =new ChromeDriver();
        //open youtube page
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        //navigate to amazon website
        driver.navigate().to("https://www.amazon.in/");
        //navigate to immediate previous page
        driver.navigate().back();
        //navigate to immediate next page
        driver.navigate().forward();
        //refresh current page
        driver.navigate().refresh();
        driver.close();
    }
    @Test
    public void switchToSongs() {
        driver = new ChromeDriver();
        //open youtube page
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.quit();
    }
}
