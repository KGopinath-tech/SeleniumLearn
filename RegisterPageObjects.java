package practise;

import org.openqa.selenium.By;

public class RegisterPageObjects {
    static String txtBoxFirstName="input-firstname";
    static String txtBoxLastName="lastname";
    static By txtBoxMail=By.xpath("//*[@id='error-email']/preceding-sibling::input");
    static By txtPass=By.xpath("//input[@type='password']");
    static By btnAgree =By.xpath("//input[@name='agree']");
    static By btnSubmit =By.xpath("//button[@type='submit']");
    static By msgSuccess=By.xpath("//h1");
}
