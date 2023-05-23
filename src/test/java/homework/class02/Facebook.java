package homework.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Doe");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("john.doe@anymail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("john.doe@anymail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).findElement(By.xpath("//option[text()='Jun']")).click();
        driver.findElement(By.xpath("//select[@name='birthday_day']")).findElement(By.xpath("//option[text()='7']")).click();
        driver.findElement(By.xpath("//select[@name='birthday_year']")).findElement(By.xpath("//option[text()='1985']")).click();
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
        Thread.sleep(1000);
        driver.close();

        WebDriver fireDriver = new FirefoxDriver();
        fireDriver.get("https://www.facebook.com");
        fireDriver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        fireDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
        fireDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Doe");
        fireDriver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("john.doe@anymail.com");
        fireDriver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("john.doe@anymail.com");
        fireDriver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password");
        fireDriver.findElement(By.xpath("//select[@name='birthday_month']")).findElement(By.xpath("//option[text()='Jun']")).click();
        fireDriver.findElement(By.xpath("//select[@name='birthday_day']")).findElement(By.xpath("//option[text()='7']")).click();
        fireDriver.findElement(By.xpath("//select[@name='birthday_year']")).findElement(By.xpath("//option[text()='1985']")).click();
        fireDriver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(1000);
        fireDriver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
        Thread.sleep(1000);
        fireDriver.close();
    }
}
