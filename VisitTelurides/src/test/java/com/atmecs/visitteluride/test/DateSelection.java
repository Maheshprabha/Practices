package com.atmecs.visitteluride.test;

import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.visitteluride.constants.FilePath;
import com.atmecs.visitteluride.helpers.CommonHelpers;
import com.atmecs.visitteluride.pages.DateSelectionPage;
import com.atmecs.visitteluride.testbase.TestBase;
import com.atmecs.visitteluride.utils.PropertyReader;

public class DateSelection extends TestBase {

	
	Properties path = new Properties();
	Properties tdata = new Properties();

	@Test
	public void selectDate() {

		path = PropertyReader.readProperty(FilePath.DATEPICKER_FILE);
		tdata = PropertyReader.readProperty(FilePath.DATETEST_FILE);
		
		CommonHelpers.scrollDown(driver,path.getProperty("loc_arrival")); 

		DateSelectionPage.selectDate(driver, "2020", "June 2020", "10");
	}
}
