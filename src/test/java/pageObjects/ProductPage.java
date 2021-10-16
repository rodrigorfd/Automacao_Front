package pageObjects;

import elementMapper.ProductPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void clickBtnAddToCart(){
        addToCart.click();
    }
    public void clickBtnCheckout(){
        btnCheckout.click();
    }
}
