package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondcase {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-click='manager()']")).click();
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("[ng-click='addCust()']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("[ng-model='fName']")).sendKeys("John");
//        driver.findElement(By.cssSelector("[ng-model='lName']")).sendKeys("Doe");
//        driver.findElement(By.cssSelector("[ng-model='postCd']")).sendKeys("7007");
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("[ng-click='openAccount()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("userSelect")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[1]/strong")).click();
        Thread.sleep(3000);



//        Thread.sleep(3000);
//            driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[4]")).click();
//            Thread.sleep(3000);
//        WebElement mainText = driver.findElement(By.className("mainHeading"));
//            mainText.click();
//            Thread.sleep(3000);
//            driver.findElement(By.cssSelector("[type='submit']")).click();
//    //        WebElement assert1 = driver.findElement(By.xpath(""));
//    //        Assert.assert

            System.out.println("First text last success!");
    }
}
