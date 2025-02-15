package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectPractice {
    public static void main(String[] args) throws InterruptedException {
        String currenctDirectory = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",currenctDirectory+"/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/select.xhtml");

        //select favorite automation tools
        WebElement toolsElement =driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(toolsElement);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByVisibleText("Puppeteer");
        Thread.sleep(2000);
        //select.deselectByVisibleText("Puppeteer");

        List<WebElement> toolsOptions = select.getOptions();
        for (int i = 0; i < toolsOptions.size(); i++) {
            System.out.println(toolsOptions.get(i).getText());
        }
        //select the favorite country
        WebElement country =driver.findElement(By.id("j_idt87:country"));
        country.click();
        Thread.sleep(2000);

       /* WebElement countryList = driver.findElement(By.xpath("//select[@id='j_idt87:country_input']"));
        Select countryselect = new Select(countryList);

        countryselect.selectByVisibleText("Brazil");
        Thread.sleep(2000);
        countryselect.selectByIndex(2);
        Thread.sleep(2000);
        countryselect.selectByValue("India");
        Thread.sleep(2000);
        countryselect.selectByContainsVisibleText("USA");
        Thread.sleep(2000);
        countryselect.deselectByVisibleText("USA");

        List<WebElement> list =countryselect.getOptions();
        for (int i = 0; i < list.size(); i++) {
            String name =list.get(i).getText();
            System.out.println(name);*/
        driver.findElement(By.xpath("//*[@id='j_idt87:country_3']")).click();
        Thread.sleep(2000);
        country.click();
        driver.findElement(By.id("j_idt87:country_4")).click();
        Thread.sleep(2000);
        country.click();
        driver.findElement(By.id("j_idt87:country_1")).click();

        //select courses (multi select)
        WebElement cources =driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete']//span[contains(@class,'triangle')]"));
        cources.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li[text()='Selenium WebDriver']")).click();
        Thread.sleep(1000);
        cources.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li[text()='Appium']")).click();
        Thread.sleep(1000);
        cources.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li[text()='PostMan']")).click();
        Thread.sleep(1000);
        cources.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li[text()='RestAssured']")).click();
        Thread.sleep(1000);
        cources.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li[text()='JMeter']")).click();

        Thread.sleep(2000);
        //select languages
        WebElement language = driver.findElement(By.xpath("//*[@id='j_idt87:lang']"));
        language.click();
        driver.findElement(By.xpath("//*[@id='j_idt87:lang_items']/li[text()='Tamil']")).click();
        Thread.sleep(2000);
        language.click();
        driver.findElement(By.xpath("//*[@id='j_idt87:lang_items']/li[text()='Malayalam']")).click();
        Thread.sleep(2000);
        language.click();
        driver.findElement(By.xpath("//*[@id='j_idt87:lang_items']/li[text()='English']")).click();
        Thread.sleep(2000);

        //select two irrespective of lang
        driver.findElement(By.id("j_idt87:value_label")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("j_idt87:value_3")).click();
        Thread.sleep(2000);
        driver.close();



    }


    }
