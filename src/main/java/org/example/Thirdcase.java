package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdcase {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-click='manager()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-click='showCust()']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[ng-click='deleteCust(cust)']")).click();
        Thread.sleep(3000);
    }
}
