package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/gopin/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/opencart/upload/");

        JavascriptExecutor Js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        WebElement myAccBtn = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccBtn.click();
        WebElement registerLnk= driver.findElement(By.linkText("Register"));
        registerLnk.click();
        Thread.sleep(5000);

        WebElement firstNameTxtbox= driver.findElement(By.id("input-firstname"));
        firstNameTxtbox.sendKeys("madhu");

        WebElement lastNameTxtbox = driver.findElement(By.name("lastname"));
        lastNameTxtbox.sendKeys("mitha");

        WebElement mailTxtbox= driver.findElement(By.xpath("//*[@id='error-email']/preceding-sibling::input"));
        mailTxtbox.sendKeys("madhumitha@gmail.com");

        WebElement passTxtbox = driver.findElement(By.xpath("//input[@type='password']"));
        Js.executeScript("arguments[0].scrollIntoView();", passTxtbox);
        passTxtbox.sendKeys("Tamil301099?");


        Thread.sleep(2000);
        WebElement agreeChkbox = driver.findElement(By.xpath("//input[@name='agree']"));
        agreeChkbox.click();

        WebElement contbox = driver.findElement(By.xpath("//button[@type='submit']"));
        contbox.click();

        Thread.sleep(5000);

        WebElement successMessage= driver.findElement(By.xpath("//h1"));
        String actualMess = successMessage.getText();
        if (actualMess.contains("Created!")){
            System.out.println("Test is passed");
        }else
            System.out.println("Test is failed");
        driver.close();
    }
}
