package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void doSearch(String wish){
        search_query_top.sendKeys(wish);
        submit_search.click();
    }

    public String getMyAccountName(){
        return myAccountName.getText();
    }

}
