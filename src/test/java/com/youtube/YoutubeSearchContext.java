package com.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class YoutubeSearchContext {
    public WebDriver driver;
    @Test
    public void searchSong() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //search context interface
        driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("java");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

        List<WebElement> list = driver.findElements(By.xpath("//*[@id='chips-content']"));
        System.out.println("Total elements : "+list.size());
        for (WebElement elements : list){
            System.out.println("List : "+elements.getText());
        }
    }
}
