import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registerpage {

    WebDriver driver;
    @Test(priority = 1)
    void openBrowser() {
        System.out.println("open google browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login?returnurl=%2F");
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Tushar");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Panchani");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("12");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("March");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1993");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("panchani1008@gmail.com");
        driver.findElement((By.xpath("//input[@id='Company']"))).sendKeys("Shri Hari");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("panchani");
        driver.findElement((By.xpath("//*[@id=\"ConfirmPassword\"]"))).sendKeys("panchani");
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("panchani1008@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("panchani");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
        driver.quit();

    }

    }
