package com.ActTIme.Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ActTIme.Generic.BaseTest;
import com.ActTIme.Generic.ExcelData;
import com.ActTIme.Pages.LoginPage;

public class TC03 extends BaseTest
{
		@Test(priority=3)
		public void Verifyversion()
		{
			String title = ExcelData.getData(file_path, "TC01", 1,2);
			String eversion = ExcelData.getData(file_path, "TC03", 1,0);
			LoginPage lp= new LoginPage(driver);
			lp.verifyTitle(title);
			String aversion=lp.verifyVersion();
			Assert.assertEquals(aversion, eversion);
		}	
	
		
		

}
