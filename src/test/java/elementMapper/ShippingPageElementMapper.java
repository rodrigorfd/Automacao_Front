package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPageElementMapper {

    @FindBy(css = "input[type='checkbox']")
    public WebElement checkbox;

    @FindBy(css = "button[name=\"processCarrier\"]")
    public WebElement btnSubmitShipping;

    @FindBy(css = ".navigation_page")
    public WebElement namePageShipping;
}
