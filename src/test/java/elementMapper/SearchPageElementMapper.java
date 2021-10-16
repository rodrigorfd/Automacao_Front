package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageElementMapper {

    @FindBy(css = ".color-list-container")
    public WebElement container;

    @FindBy(css = "#color_22")
    public WebElement color_22;
}
