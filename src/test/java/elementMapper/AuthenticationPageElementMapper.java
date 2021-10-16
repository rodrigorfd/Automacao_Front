package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPageElementMapper {

    @FindBy(css = "input[name=\"id_gender\"]#id_gender1")
    public WebElement id_gender1;

    @FindBy(id = "customer_firstname")
    public WebElement customer_firstname;

    @FindBy(id = "customer_lastname")
    public WebElement customer_lastname;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(css = "#days")
    public WebElement days;
    @FindBy(css = "#months")
    public WebElement months;
    @FindBy(css = "#years")
    public WebElement years;

    @FindBy(id = "newsletter")
    public WebElement newsletter;
    @FindBy(id = "optin")
    public  WebElement optin;

    @FindBy(id = "company")
    public  WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;
    @FindBy(id = "address2")
    public  WebElement address2;
    @FindBy(id = "city")
    public  WebElement city;
    @FindBy(css = "#id_state option[value='11']")
    public  WebElement state;

    @FindBy(id = "postcode")
    public  WebElement postcode;

    @FindBy(css = "#id_country option[value='21']")
    public WebElement country;

    @FindBy(id = "other")
    public  WebElement other;

    @FindBy (id = "phone")
    public WebElement phone;

    @FindBy(id = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy(id = "alias")
    public WebElement AltAddress;

    @FindBy(id = "submitAccount")
    public WebElement submitAccount;
}
