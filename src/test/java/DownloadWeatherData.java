import javafx.scene.layout.Priority;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DownloadWeatherData {

    public static WebDriver driver=null;
    public static String browserName="firefox";
    public static String base_URL="http://218.248.26.227/DATA/";

    public static String CCCC="VOAM";
    public static String currentURL;
    public static String currentdate;


    @BeforeClass
    public static void initialize()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\chrome\\geckoDriver.exe");
        driver =new FirefoxDriver();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        currentdate=formatter.format(date);
        driver.get(base_URL+ CCCC + currentdate + ".txt");
    }

    @Test(priority = 0)
    public void openReport() throws InterruptedException, IOException
    {
        String pagesource=driver.getPageSource();
        System.out.println("Welcome to jenkins");

        FileWriter writer= new FileWriter("C:\\Users\\mmt7667\\Desktop\\"+CCCC + currentdate + ".txt");
        BufferedWriter bf1 = new BufferedWriter(writer);
        bf1.write(pagesource);
        bf1.close();
        System.out.println("File saved to your local");

    }

   // @Test(priority = 1)
  /*  public void onFailure(){

        System.out.println("Incorrect URL for report");
        Assert.assertTrue(false);

    }*/


}
