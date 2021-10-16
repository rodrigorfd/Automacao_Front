package pageObjects;

import elementMapper.AddressPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AddressPage extends AddressPageElementMapper {

    public AddressPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void fillTextBox(String text){
        TextBox.sendKeys(text);
    }

    public void clickBtnProceedAddress(){
        btnAddress.click();
    }

    public String getNamePageAddress(){
        return namePageAddress.getText();
    }

}
