package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	
	
	@Test
	public void verifyTheUserIsAbleToCreateTheAdminUsers() throws IOException

	{

		        String username=ExcelUtility.getStringData(1, 0, "loginpage");

		        String password=ExcelUtility.getStringData(1, 1, "loginpage");

		        //String user=ExcelUtility.getStringData(1, 0, "adminusers");

				//String pass=ExcelUtility.getStringData(1, 1, "adminusers");
		        FakerUtility fakerutility=new FakerUtility();
		        String adminusername=fakerutility.creatARandomFirstName();
		        String adminupassword=fakerutility.creatARandomFirstName();
		        
				LoginPage loginpage=new LoginPage(driver);

				loginpage.enterTheUsername(username);

				loginpage.enterThePassword(password);

				loginpage.clickSigninButton();

				AdminUsersPage adminuserspage=new AdminUsersPage(driver);

				adminuserspage.clickMoreInformationAdmin();

				adminuserspage.clickNewButton();

				adminuserspage.enterUserName(adminusername);

				adminuserspage.enterPassword(adminupassword);

				adminuserspage.selectUserType();

				adminuserspage.saveAdminUsers();

			boolean alert=adminuserspage.displayAlertMessage();

			Assert.assertTrue(alert);

	}
}

