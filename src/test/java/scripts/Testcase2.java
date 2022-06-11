package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillrarydemoapplication();
	driverUtilies.switchTabs(driver);
	
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	driverUtilies.dropDown(sd.getCoursedd(),pdata.getpropertydata("course"));
	
	TestingPage t=new TestingPage(driver);
	driverUtilies.draganddrop(driver,t.getSeleniumtraiing(),t.getCart());
	Point loc = t.getFacebookicon().getLocation();
	int x=loc.getX();
	int y=loc.getX();
	driverUtilies.scrollbar(driver, x, y);
	t.facebook();
	
	}

}
