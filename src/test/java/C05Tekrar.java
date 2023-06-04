import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //ödev : 4
        //ManageWindowSet
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("htpps://amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setSize(new Dimension(800,800));
        driver.manage().window().setPosition(new Point(100,50));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Dimension size = new Dimension(800,800);
        Point  position = new Point(100,50);

        Point currentPosition = driver.manage().window().getPosition();
        Dimension currentSize = driver.manage().window().getSize();

        if (currentPosition.equals(position)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // Dimension currentSize = driver.manage().window().getSize();
        if (currentSize.equals(size)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


        //Sayfayi kapatin
        driver.close();

    }
}

