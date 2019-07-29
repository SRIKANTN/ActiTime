package com.ActTIme.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ActTIme.Generic.BaseTest;
import com.ActTIme.Generic.ExcelData;
import com.ActTIme.Pages.EnterTimeTrackPage;
import com.ActTIme.Pages.LoginPage;



public class TC01 extends BaseTest
{
	@Test(priority=1)
	public void ValidLoginLogout() throws InterruptedException
	{
		String un=ExcelData.getData(file_path, "TC01", 1, 0);
		String pw= ExcelData.getData(file_path, "TC01", 1, 1);
		String lgtitle= ExcelData.getData(file_path, "TC01", 1, 2);
		String hptitle= ExcelData.getData(file_path, "TC01", 1, 3);
		
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage em = new EnterTimeTrackPage(driver);
		lp.verifyTitle(lgtitle);
		lp.EnterUserName(un);
		lp.EnterPassWord(pw);
		lp.CLickOnLogin();
		lp.verifyTitle(hptitle);
		em.ClickOnLogOut();
		lp.verifyTitle(lgtitle);
		
	}

}
