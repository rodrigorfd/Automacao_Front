package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Fez uma busca")
    public void doSearch(String wish){
        search_query_top.sendKeys(wish);
        submit_search.click();
    }

    @Step("Validou pagina de My Account")
    public String getMyAccountName(){
        return myAccountName.getText();
    }

}
