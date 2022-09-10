package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.utilities.ReadXLSData;

public class Quiz_Statelymen_Test extends BaseTest {
	
	@Test(dataProviderClass=ReadXLSData.class, dataProvider="Quiz_Already_SignUp_Email_Data")
	public static void Quiz_Test_Login(String username, String password) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//*[@id=\"AccessibleNav\"]/li[1]/a")).click();

		//driver.findElement(By.xpath("//a[contains(text(),'GET STARTED ')]")).click();
		driver.findElement(By.xpath(loc.getProperty("HomePage_Get_Started_Button"))).click();
		Thread.sleep(1000);
		System.out.println("Click on Get Started button :  clicked Successfully");

		driver.findElement(By.xpath("//input[@name='question_box_1' and @id ='business-span-and-span-casual']"))
				.click();
		Thread.sleep(1000);
		System.out.println("STEP 1 : How Do You Dress your work clicked Successfully");

		driver.findElement(By.xpath("//*[@id=\"shopify-section-question_2\"]/div[2]/form/div/div[2]/input")).click();
		Thread.sleep(1000);
		System.out.println("STEP 2 : How About on the weekend clicked Successfully");

		driver.findElement(By.xpath("//*[@id=\"shopify-section-question_3\"]/div[2]/form/div/div[4]/input")).click();
		Thread.sleep(1000);
		System.out.println("STEP 3 : What size top do you wear clicked Successfully");

		driver.findElement(By.xpath("//*[@id=\"shopify-section-question_4\"]/div[2]/form/div/div[2]/div/input"))
				.click();
		Thread.sleep(1000);
		System.out.println("STEP 4 : How do you like your shirts to fit clicked Successfully");

		driver.findElement(By.xpath("//*[@id=\"myselect_1\"]/div[5]/input")).click();
		Thread.sleep(1000);
		System.out.println("STEP 5 : What is your pants waist size clicked Successfully");

		driver.findElement(By.xpath("//*[@id=\"shopify-section-question_6\"]/div[2]/div[1]/div[3]/input")).click();
		Thread.sleep(1000);
		System.out.println("STEP 6 : What is your pants inseam measurement? clicked Successfully");

		driver.findElement(By.xpath("//*[@id=\"shopify-section-question_7\"]/div[2]/form/div/div[2]/div/input"))
				.click();
		Thread.sleep(1000);
		System.out.println("STEP 7 : How do you like your pants to fit? clicked Successfully");

		driver.findElement(By.xpath("//*[@id=\"shopify-section-question_8\"]/div[2]/div[1]/div[5]/input")).click();
		Thread.sleep(1000);
		System.out.println("STEP 8 : What is your shoe size? clicked Successfully");

		//driver.findElement(By.xpath("//*[@id=\"customer_email\"]")).sendKeys("rohansinghh232@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"customer_email\"]")).sendKeys(username);
		Thread.sleep(3000);
		System.out.println("STEP 9 : Fill the mail -  clicked Successfully");

/*		driver.findElement(By.xpath("//*[@id=\"submit-email-after-quiz_btn1\"]")).click();
		Thread.sleep(1000);
		System.out.println("Click the Continue with Email : successfully");

		//driver.findElement(By.xpath("/html/body/div[5]/main/div/div[2]/div[8]/div[2]/div/div[3]/div[1]/form/input[5]")).sendKeys("Qwerty@23");
		driver.findElement(By.xpath("/html/body/div[5]/main/div/div[2]/"
				+ "div[8]/div[2]/div/div[3]/div[1]/form/input[5]")).sendKeys(password);
		Thread.sleep(1000);
		System.out.println("fill the password : successfully");

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p/input")).click();
		System.out.println("click on the submit button: succesfully");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//*[@id=\"shopify-section-plan-page\"]/div[1]/div/div/div[1]/div[2]/div[3]/a/div/button"))
				.click();
		Thread.sleep(1000);
		System.out.println("click on the Regal Plan : Successfully");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,900)");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"AddToCartForm--plan-page\"]/div[3]/div/div[2]/div/button/span")).click();
		Thread.sleep(1000);
		System.out.println("click on the pop up Select Regal Plan : Clicked Succesffully");

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn cross_upsell_checkout_2']")).click();
		Thread.sleep(1000);
		System.out.println("Clicked on Checkout Button Successfully");
*/		
	}
	
	/*
	 * @DataProvider(name="testdata") public Object[][] tData()
	 * 
	 * { return new Object[][] { {"rohansinghh232@gmail.com","Qwerty@23"},
	 * {"amaantyagi007@gmail.com","Qwerty@231"}, {"aakash@toecap.com","aakash@123"},
	 * {"rohansinghh23211@gmail.com","Qwerty@1123"} };
	 * 
	 * }
	 */

}
