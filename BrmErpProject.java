package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrmErpProject {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/gopin/Downloads/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://brm.tremplintech.in/web_pages/login.aspx");
        String username = "//input[@name='txt_unam']";
        driver.findElement(By.xpath(username)).sendKeys("sylix");

        By passWord = By.id("txt_pass");
        driver.findElement(passWord).sendKeys("admin");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='txt_pass']//following::input[@value='LOGIN']"));
        loginBtn.click();

        Thread.sleep(3000);

        List<WebElement> linkList = driver.findElements(By.xpath("//a"));
        String linkText = linkList.get(0).getText();
        System.out.println(linkText);

        Thread.sleep(3000);

        for (int i = 0; i < linkList.size(); i++) {
            String text =linkList.get(i).getText();
           if(!text.equals("")){
               System.out.println(text);
            }
            //System.out.println(linkList.get(i).getText());

        }
        driver.close();
    }
}
