package pageObjects;

import elementMapper.PaymentPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PaymentPage extends PaymentPageElementMapper {

    public PaymentPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void clickbtnPaymentMethod(){
        btnPaymentMethod.click();
    }

    public void clickBtnConfirmOrder(){
        btnConfirmOrder.click();
    }

    public String getOrderConfirmation(){
        return orderConfirmation.getText();
    }
}
