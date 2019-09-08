import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", "C:\\Nowy folder\\chromedriver_win32_75\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com");

        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.className("sb-destination__input"));
        System.out.println(element.getAttribute("placeholder"));
        WebElement element2 = driver.findElement(By.className("js-searchform-subscribe-box-textfield"));
        System.out.println(element2.getAttribute("placeholder"));


    }
}