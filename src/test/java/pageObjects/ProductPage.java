package pageObjects;

import elementMapper.ProductPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Adicionou um produto ao carrinho")
    public void clickBtnAddToCart(){
        addToCart.click();
    }

    @Step("Clicou no botão para avançar para o Checkout")
    public void clickBtnCheckout(){
        btnCheckout.click();
    }

    @Step("Escolheu o tamanho do produto")
    public void selectSize(String tam){
        size.findElement(By.cssSelector("option[title="+tam+"]")).click();
    }
}
