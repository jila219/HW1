package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("aHMED");
        driver.findElement(By.name("customer.lastName")).sendKeys("abdalah");
        driver.findElement(By.id("customer.address.street")).sendKeys("1122 waterford ");
        driver.findElement(By.name("customer.address.city")).sendKeys("Columbus");
        driver.findElement(By.name("customer.address.state")).sendKeys("Ohio");
        driver.findElement(By.className("input")).sendKeys("43228");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("6148433711");
        driver.findElement(By.name("customer.ssn")).sendKeys("165-12-5432");
        driver.findElement(By.name("customer.username")).sendKeys("mohamed21");
        driver.findElement(By.id("customer.password")).sendKeys("hmn12345");
        driver.findElement(By.name("repeatedPassword")).sendKeys("hmn12345");
        driver.findElement(By.className("button")).click();

    }
}
