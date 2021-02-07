package ld.test.animation.automation.bdd;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceSuite extends SerenityStories {
	
	public  AcceptanceSuite() {


		// System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");

        
		System.setProperty("webdriver.ie.driver",
		"C:\\Dev\\ChromeDriver/IEDriverServer.exe");
		

	//	System.setProperty("phantomjs.binary.path",
	//	"src/test/resources/drivers/phantomjs.exe");


		}

}
