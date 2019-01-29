package testwebpage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import webpage.WebPage;

public class TestWebPage extends WebPage {
    WebPage homePageMenu;
    @BeforeMethod
    public void initElements(){
        homePageMenu = PageFactory.initElements(ad, WebPage.class);
    }
    @Test
    public void testMenuBar() {
        homePageMenu.checkMenuBar();
    }
}
