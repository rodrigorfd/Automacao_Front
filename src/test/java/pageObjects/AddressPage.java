package pageObjects;

import elementMapper.AddressPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AddressPage extends AddressPageElementMapper {

    public AddressPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Descreveu detalhes do pedido")
    public void fillTextBox(String text){
        TextBox.sendKeys(text);
    }

    @Step("Clicou no botão Proceed Address")
    public void clickBtnProceedAddress(){
        btnAddress.click();
    }
}
