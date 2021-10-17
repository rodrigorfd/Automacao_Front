package pageObjects;

import elementMapper.CartPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends CartPageElementMapper {

    public CartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Validou nome do produto no carrinho")
    public String getNameProductCar(){
        return productNameCart.getText();
    }

    @Step("Clicou no botão Proceed to Checkout")
    public void clickBtnProceedToCheckout(){
        ProceedToCheckout.click();
    }


}
