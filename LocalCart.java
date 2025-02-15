package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalCart {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/gopin/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/opencart/upload/");

        JavascriptExecutor Js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.findElement(HomePageObjects.myAccBtn).click();

        driver.findElement(HomePageObjects.registerLnk).click();
        Thread.sleep(2000);

        driver.findElement(By.id(RegisterPageObjects.txtBoxFirstName)).sendKeys("madhumitha");

        driver.findElement(By.name(RegisterPageObjects.txtBoxLastName)).sendKeys("K");

        WebElement mailTxtbox= driver.findElement(RegisterPageObjects.txtBoxMail);
        mailTxtbox.sendKeys("madhumitha1@gmail.com");

        WebElement passTxtbox = driver.findElement(RegisterPageObjects.txtPass);
        Js.executeScript("arguments[0].scrollIntoView();", passTxtbox);
        passTxtbox.sendKeys("Tamil301099?");


        Thread.sleep(2000);
        WebElement agreeChkbox = driver.findElement(RegisterPageObjects.btnAgree);
        agreeChkbox.click();

        WebElement contbox = driver.findElement(RegisterPageObjects.btnSubmit);
        contbox.click();

        Thread.sleep(5000);

        WebElement successMessage= driver.findElement(RegisterPageObjects.msgSuccess);
        String actualMess = successMessage.getText();
        if (actualMess.contains("Created!")){
            System.out.println("Test is passed");
        }else
            System.out.println("Test is failed");
        driver.close();
    }
}
