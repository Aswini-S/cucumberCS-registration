package ccmbr.casestudy;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reg {
		WebDriver driver;
		int i;
	  
	  @Given("^User should be in Browser$")
	  public void user_should_be_in_Browser() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
		  
		  driver = CSutil.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	      
	  }

	  @When("^User Enters the  TestMe Application URL$")
	  public void user_Enters_the_TestMe_Application_URL() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	      
	  }

	  @Then("^Landed in TestMe App Home Page$")
	  public void landed_in_TestMe_App_Home_Page() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	     
	  }

	  @Given("^User should click on Sign-Up button$")
	  public void user_should_click_on_Sign_Up_button() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	     
	  }

	  @Given("^fill up the new account form with the following data$")
	  public void fill_up_the_new_account_form_with_the_following_data(DataTable dt) throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	      // For automatic transformation, change DataTable to one of
	      // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	      // E,K,V must be a scalar (String, Integer, Date, enum etc)
		  
			System.out.println("Forms filled with:  ");
			List <Map<String, String>> list=dt.asMaps(String.class, String.class);
			for(i=0;i<list.size();i++)
			{
				PageCS login = PageFactory.initElements(driver, PageCS.class);
				login.login_new(list.get(i).get("User Name"),(list.get(i).get("First Name")),
						(list.get(i).get("Last Name")),(list.get(i).get("password")),(list.get(i).get("confirmpassword")),(list.get(i).get("Gender")),
						(list.get(i).get("E-mail")),(list.get(i).get("Mobile Number")),(list.get(i).get("DOB")),
						(list.get(i).get("Address")),(list.get(i).get("Security Questions")),(list.get(i).get("Answers")));
			}
		    
		}
		  
	      
	

	  @Then("^Click on Register Button$")
	  public void click_on_Register_Button() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	     
	  }
}
