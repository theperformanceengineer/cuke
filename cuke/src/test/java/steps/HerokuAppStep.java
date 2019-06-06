package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import java.util.List;

public class HerokuAppStep {
	
	
	WebDriver driver;
	String link;
	List<WebElement> we;
	String cssselector1;
	
	
	/*@Given("The Application is opened in Chrome browser")
	public void the_Application_is_opened_in_Chrome_browser()*/
	@Given("^The URL \"(.*?)\" is opened in Chrome browser$")
	public void the_URL_https_the_internet_herokuapp_com_is_opened_in_Chrome_browser(String url) {
	   // System.out.println("First");
		System.out.println("URL : "+url);
	    System.setProperty("webdriver.chrome.driver", "C:\\SDET\\Automation\\SeleniumDependencies\\chromedriver.exe");	
		driver = new ChromeDriver();				  
		//String url="https://the-internet.herokuapp.com/";
		driver.get(url);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
	}
	
	//@When("I click on the {string} link")
	@When("^I click on the \"(.*)\" link$")
	public void i_click_on_the_link(String string) {
	    System.out.println("Value Of variable:" +string);
	    if (string.equals("A/B Testing")) {
	    	cssselector1="#content > ul > li:nth-child(1) > a";
		}
	    else if(string.equals("CheckBoxes"))
	    {
	    	System.out.println("Inside Checkboxes condition");
	    	cssselector1="#content > ul > li:nth-child(6) > a";
	    }
	    WebElement element =driver.findElement(By.cssSelector(cssselector1));
		 link =element.getText();
		element.click();
	}

	//@Then("the A\\/B page should be loaded")
	@Then("the (.*) should be loaded")
	public void the_A_B_page_should_be_loaded(String page) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Value Of page:" +page);
		System.out.println("Third");	
		if (page.equals("A/B page")) {
			WebElement text=driver.findElement(By.cssSelector("#content > div > h3"));
			String heading=text.getText();
			System.out.println("Heading :"+heading);
			//assertEquals(heading,"A/B Test Variation 1");
			boolean b=heading.contains("A/B");
			assertEquals(b,true);
		}
		else if(page.equals("Checkboxes page"))
		{
			WebElement chkbox1=driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
			assertEquals((chkbox1.isEnabled()),true);
			System.out.println("Checkbox control is enabled");
			
		}
				
		driver.quit();
	}
	////New test steps
	/*@Given("The URL https:\\/\\/the-internet.herokuapp.com is opened in Chrome browser")
	public void the_URL_https_the_internet_herokuapp_com_is_opened_in_Chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/

	/*@Given("The URL https:\\/\\/the-internet.herokuapp.com\\/login is opened in Chrome browser")
	public void the_URL_https_the_internet_herokuapp_com_login_is_opened_in_Chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
*/
	@When("Valid username and password is provided")
	public void valid_username_and_password_is_provided() {
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("tomsmith");
		WebElement pw=driver.findElement(By.id("password"));
		pw.sendKeys("SuperSecretPassword!");
		WebElement smt=driver.findElement(By.cssSelector("#login > button"));
		smt.submit();
		
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	   WebElement logout= driver.findElement(By.cssSelector("#content > div > a"));
	    if (logout==null) {
			System.out.println("User is logged in successfully");
		}
	    logout.click();
		System.out.println("User is logged out successfully");
		driver.quit();
	}	
	
}
