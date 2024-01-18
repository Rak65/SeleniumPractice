package com.facebook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FacebookPage {

    @Test
    public void facebook() throws InterruptedException, IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        // Navigate to Facebook
        driver.get("https://www.facebook.com");

        // Login
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));

        emailInput.sendKeys("rakp6505@gmail.com");
        passwordInput.sendKeys("Rakesh@560068");
        loginButton.click();
        Thread.sleep(5000);

        WebElement homeLink = driver.findElement(By.xpath("//a[@aria-label='Home']"));
        homeLink.click();
        Thread.sleep(5000);

        // Write a post
        WebElement createPostInput = driver.findElement(By.xpath("//span[text()='Photo/video']"));
        createPostInput.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']")).sendKeys("Hello, this is my facebook posts!!");

        // Add a picture
        WebElement addPhotoButton = driver.findElement(By.xpath("//div[@class='x14yjl9h xudhj91 x18nykt9 xww2gxu x6s0dn4 x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x3nfvp2 xl56j7k x1n2onr6 x1qhmfi1 x1vqgdyp x100vrsf']"));
        addPhotoButton.click();

        // upload a picture
        Runtime.getRuntime().exec("H:\\CFP251\\AutoIt\\FacebookFile.exe");
        Thread.sleep(3000);
        // Post the status
        WebElement postButton = driver.findElement(By.xpath("//span[text()='Post']"));
        postButton.click();

        // Search for a friend
        WebElement searchBox = driver.findElement(By.xpath("//input[@aria-label='Search Facebook']"));
        searchBox.sendKeys("Akarsh Kumar");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        // Like the friend's post

        //Count number of likes
        driver.findElement(By.xpath("//span[text()='Rakesh Kumar']")).click();     //Go to your posts
        Thread.sleep(5000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
        Thread.sleep(5000);

         WebElement like = driver.findElement(By.xpath("//div[@class='x6s0dn4 x78zum5 x1iyjqo2 x6ikm8r x10wlt62']//span[text()='You']"));
//        WebElement like = driver.findElement(By.xpath("//div[@class='x1n2onr6']/div[@class='x6s0dn4 xi81zsa x78zum5 x6prxxf x13a6bvl xvq8zen xdj266r xktsk01 xat24cr x1d52u69 x889kno x4uap5 x1a8lsjc xkhd6sd xdppsyt']/div/span[@aria-label='See who reacted to this']/span[@id=':r33:']"));
//        like.click();
        javascriptExecutor.executeScript("arguments[0].click();", like);
        Thread.sleep(4000);
        List<WebElement> likeCount = driver.findElements(By.xpath("//div[@class='x78zum5 xdt5ytf x1iyjqo2 x1n2onr6']/div[@data-visualcompletion='ignore-dynamic']"));
        System.out.println("No of like : " + likeCount.size());
        Thread.sleep(5000);

        // Take Screenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File StFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File DsFile = new File("H:\\CFP251\\Automation\\FacebookScreenshot\\facebook.png");
        FileHandler.copy(StFile, DsFile);
        Thread.sleep(3000);

        // close the popup
        driver.findElement(By.xpath("//div[@aria-label='Close']")).click();
        // Go back to the profile
        driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']")).click();
        Thread.sleep(5000);
//         Logout
        driver.findElement(By.xpath("//span[text()='Log out']")).click();
//         Close the browser
        driver.close();

    }
}