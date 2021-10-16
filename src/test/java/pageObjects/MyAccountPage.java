package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

import java.util.WeakHashMap;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void doSearch(String args){
        search_query_top.sendKeys(args);
        submit_search.click();
    }

}
