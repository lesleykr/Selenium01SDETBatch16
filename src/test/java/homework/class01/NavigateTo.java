package homework.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Jack");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.name("customer.address.street")).sendKeys("103 Maple");
        driver.findElement(By.name("customer.address.city")).sendKeys("Philadelphia");
        driver.findElement(By.id("customer.address.state")).sendKeys("Pennsylvania");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("19067");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("513-729-4630");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-11-1111");
        driver.findElement(By.id("customer.username")).sendKeys("jsmith123");
        driver.findElement(By.id("customer.password")).sendKeys("password123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password123");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
