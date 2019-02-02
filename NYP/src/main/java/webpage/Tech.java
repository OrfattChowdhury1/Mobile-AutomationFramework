package webpage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Tech extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    public static WebElement menuTech;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[12]")
    public static WebElement techNews;
    public void setTech() throws InterruptedException {
        menuTech.click();
        sleep(2);
        techNews.click();
        scrollAndClickByName("EBay shares surge 12 percent after activist investor calls for breakup");
        sleep(2);
        String Actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String Expected = "EBay shares surge 12 percent after activist investor calls for breakup";
        Assert.assertEquals(Actual, Expected);
        System.out.println(Actual);
    }
    public void getTech1(){
        menuTech.click();
        techNews.click();
        scrollAndClickByName("First-of-its-kind NYPD VR gaming system targets teens");
        String actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String expected = "First-of-its-kind NYPD VR gaming system targets teens";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void getTech2(){
        menuTech.click();
        techNews.click();
        scrollAndClickByName("EBay shares surge 12 percent after activist investor calls for breakup");
        String actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String expected = "EBay shares surge 12 percent after activist investor calls for breakup";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void getTech3(){
        menuTech.click();
        techNews.click();
        scrollAndClickByName("Bizarre deep-sea fish found living with ‘virtually no oxygen’");
        String actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String expected = "Bizarre deep-sea fish found living with ‘virtually no oxygen’";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void getTech4(){
        menuTech.click();
        techNews.click();
        scrollAndClickByName("The mythical ‘Planet Nine’ theory has sadly been re-debunked");
        String actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String expected = "The mythical ‘Planet Nine’ theory has sadly been re-debunked";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }
    public void getTech5(){
        menuTech.click();
        techNews.click();
        scrollAndClickByName("Chinese scientist behind gene-edited babies may face charges");
        String actual = ad.findElement(By.id("br.com.golmobile.nypost:id/title_text")).getText();
        String expected = "Chinese scientist behind gene-edited babies may face charges";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
    }

}
