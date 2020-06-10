package com.atmecs.visitteluride.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.visitteluride.constants.FilePath;
import com.atmecs.visitteluride.helpers.CommonHelpers;
import com.atmecs.visitteluride.helpers.Waits;
import com.atmecs.visitteluride.pages.IframePage;
import com.atmecs.visitteluride.testbase.TestBase;
import com.atmecs.visitteluride.utils.PropertyReader;

public class IframeActions extends TestBase {

	
	Properties path = new Properties();
	Properties tdata = new Properties();

	@Test
	public void iframeValidation() throws Exception {

		path = PropertyReader.readProperty(FilePath.IFRAME_FILE);

		/*Robot class Key board events*/
		CommonHelpers.click(driver, "//input[@id=\"arrivalDate\"]");
		IframePage.keyboardEvents();
		CommonHelpers.switchToFrame(driver, path.getProperty("loc_iframe"));
		CommonHelpers.scrollDown(driver, path.getProperty("loc_email"));
		IframePage.iframe1Validation(driver, path.getProperty("loc_email"), path.getProperty("loc_country"),"demouser@gmail.com", "India", path.getProperty("loc_submit"));
		WebDriver iframe_chat = CommonHelpers.switchToFrame(driver, "//iframe[@id='navis_chalk_button']");
		Waits.waitByElementClickable(driver, path.getProperty("loc_chat"));
		CommonHelpers.click(driver, path.getProperty("loc_chat"));
}
}