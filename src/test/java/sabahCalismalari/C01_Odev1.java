package sabahCalismalari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Odev1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get(" https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
       String title= driver.getTitle();
        System.out.println("title = " + title);
        //Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println("Amazon current url "+driver.getCurrentUrl());
        //Sayfa url'inin "amazon" icerdigini test edin.
        String actualUrl =driver.getCurrentUrl();
        if (actualUrl.contains("amazon")){
            System.out.println("actualUrl contains Amazon");
        }else System.out.println("test failed");
        //Sayfa handle degerini yazdirin

        System.out.println("Handle degeri "+driver.getWindowHandle());
        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
       String htmlGateway= driver.getPageSource();
       if (htmlGateway.contains("Gateway")){
           System.out.println("test passed");
       }else System.out.println("test failed");


        //Sayfayi kapatin.
        driver.close();
    }
}
