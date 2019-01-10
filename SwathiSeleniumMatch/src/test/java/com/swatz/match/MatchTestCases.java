package com.swatz.match;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MatchTestCases {

	WebDriver driver;

	@Before
	public void initialize() {
		 System.setProperty("webdriver.chrome.driver",  "src/main/resources/chromedriver");
		//System.setProperty("webdriver.firefox.marionette",  "/Users/swathipratap/Projects/SwathiPraticeProj/Newproject/resources/geckodriver");
			 
		 //created a new instance of Firefox driver
		//driver = new FirefoxDriver();
		 
		 //Setting up chrome options for opening in incognite (to avoid caching issues)
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--incognito");
		 
		 // initialize the chrome driver
		 driver = new ChromeDriver(options);
	}
	
	@Test
	public void testMatch() throws Exception {
		// Step 1: Register the User on Match.com
		 registerUser(driver);
		
		 //Step 2: Complete User Profile Details
		 userProfile(driver);
		
		 //Step 3: Search for a profile
		 search(driver); 
		
		 //Step 4: Logout
		 logout(driver);
		 
		//Step 5: Verify the registered used signed in
		 signedIn(driver);
	}
	
	@After
	public void tearDown() {
		 //close the driver
		driver.quit();
		//close system 
		//System.exit(0);
	}
	
	/**
	 * Register the User on Match.com
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private static void registerUser(WebDriver driver) throws InterruptedException {
		// Launch the  Website
//		 driver.get("https://www.match.com");
//		 // to click on the member Sign in 
//		 WebElement memberButton = driver.findElement(By.xpath("//*[@id=\"Float_right\"]/p/a"));
//		 memberButton.click();
//		 Thread.sleep(5000);
//		 
//		 WebElement newUser =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section/form/div/div/div/div[5]/div[1]/div[1]/span/a/span"));
//		 newUser.click();

		 driver.get("https://www.match.com/dnws/registration/registration.aspx");
		 
		 //adding postal code and clicking enter
		 driver.findElement(By.xpath("//*[@id=\"postalCode\"]")).sendKeys("75240");Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"progessive\"]/div[1]/fieldset[1]/button")).click();
         Thread.sleep(5000);
         
		// adding email address and password with 5 sec wait in each step	
		driver.findElement(By.name("email")).sendKeys("Julia30@gmail.com");
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"progessive\"]/div[1]/fieldset[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("smartgirl");
		Thread.sleep(5000);
		
		//for selecting the drop-down options 
		WebElement drpMonth = driver.findElement(By.xpath("//*[@id=\"birthMonth\"]"));
		Select dropdown= new Select(drpMonth);
		dropdown.selectByVisibleText("Jan");
		
		WebElement drpMonth1 = driver.findElement(By.xpath("//*[@id=\"birthDay\"]"));
		Select dropdown1= new Select(drpMonth1);
		dropdown1.selectByVisibleText("22");
		 
		 WebElement drpMonth11 = driver.findElement(By.xpath("//*[@id=\"birthYear\"]"));
		 Select dropdown11= new Select(drpMonth11);
		 dropdown11.selectByVisibleText("1989");	
		Thread.sleep(5000);
		
		//Clicking button 
		driver.findElement(By.xpath("//*[@id=\"progessive\"]/div[1]/fieldset[3]/div[3]/button")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]/input")).sendKeys("Julia");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]/button")).click();
		Thread.sleep(5000);
	    }
	
	/**
	 * Fill User Profile Details on Match.com
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private static void userProfile(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.match.com/profile/me/create/intro");
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/button[2]/span")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/ul/li[3]/div")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_intent-target\"]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_height-target\"]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[2]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[1]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[1]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[3]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[4]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[1]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[1]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div[1]/div[1]/label[4]/span[1]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_ethnicities-target\"]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div[2]/div[1]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div[1]/div[4]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/button[22]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/button[3]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/button[7]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/button[16]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/button[9]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_interests-target\"]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div[1]/div[1]/button/div")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-seek_age-target\"]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-omni_seek-target\"]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/textarea")).sendKeys("LA lal alallalalalla doing and lalalalala and la lalal lalalal to lalalallalalallaaaaaaaaaaaaallaaalaaaaaaaaaaaaaalaaaaaaaaaaaaalaaaaaaaaaaalaaaaaaaaaaa");Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_essay-target\"]/button")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/section[1]/div/div/a")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/a/span")).click();Thread.sleep(2000);
		System.out.println("Profile Completed");
		
	    }
	
	/**
	 * Search Profile
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	
	private static void search(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/nav/div/div[2]/div[2]/button")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/nav/div/div[2]/div[2]/ul/li[5]/a/div")).click();Thread.sleep(5000);
		
		//typing name in the search text box
	    driver.findElement(By.name("username-search")).sendKeys("Roni");Thread.sleep(5000);
	    
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section/div[1]/div[1]/div/div[2]/button/span")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section/div[1]/div[2]/div[2]/div/div[1]/div/div/li[1]/div[1]/span/div/a/div/div")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section/article/div[1]/div/div/div[1]/a/span[1]")).click();Thread.sleep(5000);
		
		//displaying the profile
		System.out.println("Profile displayed");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/nav/div/div[3]/div[1]/button")).click();Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/nav/div/div[3]/div[1]/ul/li[1]")).click();Thread.sleep(5000);
		Thread.sleep(5000);
	 }
	
	     /**
		 * Logout the user
		 * 
		 * @param driver
		 * @throws InterruptedException
		 */
		private static void logout(WebDriver driver) throws InterruptedException {
			driver.get("https://www.match.com/login/logout.aspx?lid=3");
			//driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[2]/div[1]/div/ul/li[9]/ul/li[3]")).click();
			Thread.sleep(5000);
			System.out.println("Signed Out");		
		}
		
		
		/**
		 * Log back the registered user
		 * 
		 * @param driver
		 * @throws InterruptedException
		 */
		private static void signedIn(WebDriver driver) throws InterruptedException {
			
	       //Launching the login page again 
			driver.get("https://www.match.com/login/");
			
			Thread.sleep(5000);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("Julia30@gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("smartgirl");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section/form/div/div/div/div[4]/button")).click();
			Thread.sleep(5000);
			System.out.println("sucessfull");
			
			
	     }

}
