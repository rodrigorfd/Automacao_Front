package pageObjects;

import elementMapper.ShippingPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShippingPage extends ShippingPageElementMapper {

    public ShippingPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Concordou com os termos")
    public void clickBtnCheckbox (){
        checkbox.click();
    }

    @Step("Confirmou forma de envio")
    public void clickBtnSubmitShipping(){
        btnSubmitShipping.click();
    }
}
