package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
    private WebElement seleniumtraiing;
	
	public WebElement getSeleniumtraiing() {
		return seleniumtraiing;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}

	public void facebook() {
		facebookicon.click();
	}
	@FindBy(id="mycart")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}
