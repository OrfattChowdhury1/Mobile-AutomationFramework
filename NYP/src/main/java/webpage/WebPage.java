package webpage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]\n")
    public static WebElement menuBar;

    public void checkMenuBar() {
        menuBar.click();
    }


}
