package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionClass {
    public WebDriver driver;
    @Test
    public void mouseOrKeyboard_Operation() throws AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Robot robot = new Robot();
        robot.mouseMove(5,10);
        robot.mouseWheel(2);

        robot.keyPress(KeyEvent.VK_E);
    }
    @Test
    public void dragDrop() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement des = driver.findElement(By.xpath("//p[text()='Drop here ']"));
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        actions.moveToElement(src).clickAndHold().perform();
        actions.release(des).perform();
    }
}