package ccmbr.casestudy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageCS
{
	WebDriver driver;

	public PageCS(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.LINK_TEXT,using="SignUp")
	@CacheLookup
	WebElement Sup_btn;

	@FindBy(name = "userName")
	@CacheLookup
	WebElement username;
	
	@FindBy(name = "firstName")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(name = "lastName")
	@CacheLookup
	WebElement lastname;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement pass;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	@CacheLookup
	WebElement c_pass;

	@FindBy(how=How.XPATH, using="//*[@id='gender']")
	@CacheLookup
	WebElement gender;

	@FindBy(name = "emailAddress")
	@CacheLookup
	WebElement email;

	@FindBy(name = "mobileNumber")
	@CacheLookup
	WebElement mob;

	@FindBy(name = "dob")
	@CacheLookup
	WebElement dateob;

	@FindBy(name = "address")
	@CacheLookup
	WebElement address;
	

	@FindBy(name = "securityQuestion")
	@CacheLookup
	WebElement sec_que;
	
	@FindBy(how=How.XPATH, using="//*[@id=\'securityQuestion\']/option[3]")
	@CacheLookup
	WebElement sec_que1;

	@FindBy(name = "answer")
	@CacheLookup
	WebElement answer;

	@FindBy(name = "Submit")
	@CacheLookup
	WebElement reg_btn;

	public void login_new(String uid, String fnme, String lnme, String pwd,
							String c_pwd, String gen, String mail, String num, String dob, 
							String add, String s_que, String ans ) 
	{
		Sup_btn.click();
		username.sendKeys(uid);
		firstname.sendKeys(fnme);
		lastname.sendKeys(lnme);
		pass.sendKeys(pwd);
		c_pass.sendKeys(c_pwd);
		gender.click();
		email.sendKeys(mail);
		mob.sendKeys(num);
		dateob.sendKeys(dob);
		address.sendKeys(add);
		sec_que.click();
		sec_que1.click();
		answer.sendKeys(ans);
		reg_btn.click();
	}

}
