package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethods {
    static WebDriver driver;
    static String oldXpath ="//a[text()='test']";

    public static void main(String[] args) throws InterruptedException {

        String currentWorkingDirectory = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver",currentWorkingDirectory+ "/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://brm.tremplintech.in/web_pages/login.aspx");
        String username = "//input[@name='txt_unam']";
        driver.findElement(By.xpath(username)).sendKeys("sylix");

        By passWord = By.id("txt_pass");
        driver.findElement(passWord).sendKeys("admin");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='txt_pass']//following::input[@value='LOGIN']"));
        click(loginBtn);

        By supply= By.xpath("//a[text()='Supplier  Management']");
        click(supply);

        String inventory = oldXpath.replace("test","Inventory management");
        click("xpath",inventory);

        String orderMgn = oldXpath.replace("test","ordermanagement");
        click("xpath",orderMgn);

        String hRMgn = oldXpath.replace("test","HRManagement");
        click("xpath",hRMgn);

        String customer =oldXpath.replace("test","Customermanagement");
        click("xpath",customer);

        String customerSearch= "ContentPlaceHolder1_Button1";
        click("id",customerSearch);

        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.close();
    }


    static void click(WebElement element) throws InterruptedException {
        Thread.sleep(3000);
        element.click();
    }
    static void click( By by) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(by).click();
    }
    static void click( String locatorType, String locatorvalue) throws InterruptedException {
        Thread.sleep(3000);
        if(locatorType.equalsIgnoreCase("id")){
            driver.findElement(By.id(locatorvalue)).click();
        } else if (locatorType.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locatorvalue)).click();
        } else if (locatorType.equalsIgnoreCase("name")) {
            driver.findElement(By.name(locatorvalue)).click();
        } else if (locatorType.equalsIgnoreCase("linktext")) {
            driver.findElement(By.linkText(locatorvalue)).click();
        } else if (locatorType.equalsIgnoreCase("tagname")) {
            driver.findElement(By.tagName(locatorvalue)).click();
        } else if (locatorType.equalsIgnoreCase("classname")) {
            driver.findElement(By.className(locatorvalue)).click();
        } else if (locatorType.equalsIgnoreCase("partiallinktext")) {
            driver.findElement(By.partialLinkText(locatorvalue)).click();
        }

    }

}




