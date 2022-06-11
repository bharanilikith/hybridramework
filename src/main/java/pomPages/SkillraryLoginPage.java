package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy(name="q")
	private WebElement serachtab;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	public SkillraryLoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
	
	public void gearsButton() {
		gearsbtn.click();
	}
	
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	
	public void searchtextbox(String name) {
		serachtab.sendKeys(name);
	}
	
	public void serachbutton() {
		gobtn.click();
	}
	
	

}
