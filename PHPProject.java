package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PHPProject {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/gopin/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/login");

        WebElement emailTxtBox = driver.findElement(By.id("email"));
        emailTxtBox.sendKeys("user@phptravels.com");

        WebElement passTxtBox = driver.findElement(By.name("password"));
        passTxtBox.sendKeys("demouser");

        WebElement lgnBtn = driver.findElement(By.xpath("//button[@id='submitBTN']"));
        lgnBtn.click();
        Thread.sleep(3000);

        String flight = "//a[normalize-space()='Flights']";
        WebElement flightBtn =driver.findElement(By.xpath(flight));
        flightBtn.click();

        WebElement flyingFrm = driver.findElement(By.xpath("//input[@name='from']"));
        flyingFrm.sendKeys("Madras");
        Thread.sleep(3000);
        WebElement frm = driver.findElement(By.xpath("//div[@class='col-12 col-md-3']//strong[1]"));
        frm.click();

        WebElement toBtn = driver.findElement(By.xpath("//input[@name='to']"));
        toBtn.sendKeys("delhi");
        Thread.sleep(3000);
        WebElement to = driver.findElement(By.xpath("//div[@class='form-floating flight_search']//div[2]//div[1]//strong[1]"));
        to.click();

        WebElement searchBtn = driver.findElement(By.xpath("//button[@id='flights-search']"));
        searchBtn.click();
        Thread.sleep(3000);
//        WebElement moreDetails = driver.findElement(By.xpath("//button[@class='flex-grow-1 btn btn-outline-primary waves-effect']"));
//        moreDetails.click();

        Thread.sleep(3000);
        driver.close();

    }
}
