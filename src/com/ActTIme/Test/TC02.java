package com.ActTIme.Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ActTIme.Generic.BaseTest;
import com.ActTIme.Generic.ExcelData;
import com.ActTIme.Pages.LoginPage;
public class TC02 extends BaseTest
{
	@Test(priority=2)
	public void InvalidLogin() throws InterruptedException
	{
		String title = ExcelData.getData(file_path, "TC01", 1,2);
		String errmsg = ExcelData.getData(file_path, "TC02", 1, 2);
		LoginPage lp = new LoginPage(driver);
		lp.verifyTitle(title);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		for(int i=1; i<=rc; i++)
		{
			String un =  ExcelData.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			Reporter.log("User Name= "+un,true);
			Reporter.log("Pass word= "+pw,true);
			lp.EnterUserName(un);
			lp.EnterPassWord(pw);
			lp.CLickOnLogin();
			String aerror = lp.verifyErrMsg();
			Assert.assertEquals(aerror, errmsg);
			Reporter.log("====================================",true);
			Thread.sleep(1000);
		}
	
		
		
		
	}

}
