package pageObjects;

import elementMapper.PaymentPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PaymentPage extends PaymentPageElementMapper {

    public PaymentPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Escolheu metodo de pagamento")
    public void clickbtnPaymentMethod(){
        btnPaymentMethod.click();
    }

    @Step("Confirmou pedido")
    public void clickBtnConfirmOrder(){
        btnConfirmOrder.click();
    }

    @Step("Validou confirmação de pedido")
    public String getOrderConfirmationPageName() {
        return OrderConfirmationPageName.getText();
    }
}
