package BDDCurrysProject.PageObject;

import BDDCurrysProject.BaseClassPackage.DriverFactoryClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactoryClass {

    @FindBy(id = "search")
    WebElement searchBox;

    @FindBy(xpath = "//span[@class='dc-button-text']")
    WebElement searchButton;

    public void seachbox(){
        searchBox.sendKeys("laptop");
    }

    public void searchbuttonclick(){
        searchButton.click();
    }
}
