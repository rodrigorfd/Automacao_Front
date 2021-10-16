package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPageElementMapper {

    @FindBy(css = "#ordermsg .form-control")
    public WebElement TextBox;

    @FindBy(css = "button[ name='processAddress']")
    public WebElement btnAddress;

    @FindBy(css = ".navigation_page")
    public WebElement namePageAddress;
}
