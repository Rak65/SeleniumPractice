package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Element {
    public WebDriver driver;
    @Test
    public void element(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        List<WebElement> list = driver.findElements(By.className("_58mt"));
        System.out.println(list.size());
        for (WebElement elements : list){
            System.out.println("Gender type : "+elements.getText());
        }
    }
}
