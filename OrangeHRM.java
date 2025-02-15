package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRM {


    public static void main(String[] args) throws InterruptedException {
        String currenctDirectory = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",currenctDirectory+"/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Directory']/ancestor::a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Admin']/ancestor::a")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()=' Add ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='User Role']/following::div[@class='oxd-select-text-input'][1]"))
                .click();








    }
}
