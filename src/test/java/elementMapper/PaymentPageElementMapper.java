package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageElementMapper {

    @FindBy(css = ".bankwire")
    public WebElement btnPaymentMethod;

    @FindBy(css = "#cart_navigation button[type=\"submit\"]")
    public WebElement btnConfirmOrder;

    @FindBy(css = "h1[class=\"page-heading\"]")
    public WebElement orderConfirmation;

    @FindBy(css = ".navigation_page")
    public WebElement NamePagePaymentMethod;

    @FindBy(css = ".navigation_page")
    public WebElement NamePageBankWirePayment;
}
