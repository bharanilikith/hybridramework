package scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{
	
	@Test
	public void tc1() {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillrarydemoapplication();
	
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	driverUtilies.switchTabs(driver);
	driverUtilies.mouseHover(driver,sd.getCoursebtn());
	sd.seleniumtrainingbtn();
	
	AddtocartPage a=new AddtocartPage(driver);
	driverUtilies.doubleClick(driver,a.getAddbtn());
	a.cartbutton();
	driverUtilies.alertpopup(driver);
	
	
	}

}
