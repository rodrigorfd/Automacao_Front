package pageObjects;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SearchPage extends SearchPageElementMapper {

    public SearchPage() {PageFactory.initElements(Browser.getCurrentDriver(),this);}

    public void selectProductByColor(){
        container.findElement(By.id("color_22") ).click();
        color_22.click();
    }
}