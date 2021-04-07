package packag;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class sourcefuse {
	WebDriver driver;
	
	@BeforeMethod
	  public void login() {
		 
		System.setProperty("webdriver.chrome.driver","/home/pratyush/Music/chromedriver_linux64/chromedriver");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize(); 
		driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.findElement(By.id("Username")).sendKeys("sfwebhtml");
		driver.findElement(By.id("Password")).sendKeys("t63KUfxL5vUyFLG4eqZNUcuRQ");
		driver.findElement(By.id("Signin")).click();
	  }
	
  @Test
  //Test Case 1: Try to submit without filling required fields and "Labels" of all the required fields printed on Console. 
  public void submit() {
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  
  }
  @Test
  //Test Case 2: Verify all input fields using Soft assertions. 
 public void softassertion() {
	  
	  SoftAssert assertion= new SoftAssert();
	  String actual1= "Pratyush";// First name
	  String actual2="Samal"; // Last Name
	  String actual3= "pratyushsamal56@gmail.com"; //email
	  String actual4= "Greet Labs Pvt Limited"; //Current Company
	  String actual= "8327795369"; // Mobile Number
	  String actual5="07/28/1995"; //DOB
	  String actual6="Software QA Engineer"; //Position you are applying for
	  String actual7="http://www.pratyushsamalQA.com";// Portfolio Website
	  String actual8="6 LPA";//Salary requirements
	  WebElement firstname=driver.findElement(By.id("fnameInput"));
	  firstname.sendKeys(actual1);
	  String expected1= firstname.getAttribute("value");
	  WebElement lastname=driver.findElement(By.id("lnameInput"));
	  lastname.sendKeys(actual2);
	  String expected2=lastname.getAttribute("value");
	  WebElement email= driver.findElement(By.id("emailInput"));
	  email.sendKeys(actual3);
	  String expected3=email.getAttribute("value");
	 WebElement currentcomapny=driver.findElement(By.id("curCompanyInput"));
	 currentcomapny.sendKeys(actual4);
	 String expected4= currentcomapny.getAttribute("value");
	 WebElement mobile=driver.findElement(By.id("mobInput"));
	 mobile.sendKeys(actual);
	 String expected= mobile.getAttribute("value");
	 WebElement dob= driver.findElement(By.id("DOBInput"));
	 dob.sendKeys(actual5);
	 String expected5= dob.getAttribute("value");
	 WebElement position=driver.findElement(By.id("positionInput"));
	 position.sendKeys(actual6);
	 String expected6= position.getAttribute("value");
	 WebElement portfolio=driver.findElement(By.id("portfolioInput"));
	 portfolio.sendKeys(actual7);
	 String expected7= portfolio.getAttribute("value");
	 WebElement salary=driver.findElement(By.id("salaryInput"));
	 salary.sendKeys(actual8);
	 String expected8= salary.getAttribute("value");
	 
	  assertion.assertEquals(actual1, expected1);
	  assertion.assertEquals(actual2, expected2);
	  assertion.assertEquals(actual3, expected3);
	  assertion.assertEquals(actual4, expected4);
	  assertion.assertEquals(actual5, expected5);
	  assertion.assertEquals(actual6, expected6);
	  assertion.assertEquals(actual7, expected7);
	  assertion.assertEquals(actual8, expected8);
	  assertion.assertEquals(actual, expected);
	  
	 // System.out.println("completed");
	  assertion.assertAll();
  }
  @Test
  //Test Case 3: Verify all input fields using Hard assertions.
  public void hardassertion() {
	  
	  String actual1= "Pratyush";// First name
	  String actual2="Samal"; // Last Name
	  String actual3= "pratyushsamal56@gmail.com"; //email
	  String actual4= "Greet Labs Pvt Limited"; //Current Company
	  String actual= "8327795369"; // Mobile Number
	  String actual5="07/28/1995"; //DOB
	  String actual6="Software QA Engineer"; //Position you are applying for
	  String actual7="http://www.pratyushsamalQA.com";// Portfolio Website
	  String actual8="6 LPA";//Salary requirements
	  WebElement firstname=driver.findElement(By.id("fnameInput"));
	  firstname.sendKeys(actual1);
	  String expected1= firstname.getAttribute("value");
	  WebElement lastname=driver.findElement(By.id("lnameInput"));
	  lastname.sendKeys(actual2);
	  String expected2=lastname.getAttribute("value");
	  WebElement email= driver.findElement(By.id("emailInput"));
	  email.sendKeys(actual3);
	  String expected3=email.getAttribute("value");
	 WebElement currentcomapny=driver.findElement(By.id("curCompanyInput"));
	 currentcomapny.sendKeys(actual4);
	 String expected4= currentcomapny.getAttribute("value");
	 WebElement mobile=driver.findElement(By.id("mobInput"));
	 mobile.sendKeys(actual);
	 String expected= mobile.getAttribute("value");
	 WebElement dob= driver.findElement(By.id("DOBInput"));
	 dob.sendKeys(actual5);
	 String expected5= dob.getAttribute("value");
	 WebElement position=driver.findElement(By.id("positionInput"));
	 position.sendKeys(actual6);
	 String expected6= position.getAttribute("value");
	 WebElement portfolio=driver.findElement(By.id("portfolioInput"));
	 portfolio.sendKeys(actual7);
	 String expected7= portfolio.getAttribute("value");
	 WebElement salary=driver.findElement(By.id("salaryInput"));
	 salary.sendKeys(actual8);
	 String expected8= salary.getAttribute("value");
	  Assert.assertEquals(actual, expected);
	  Assert.assertEquals(actual1, expected1);
	  Assert.assertEquals(actual2, expected2);
	  Assert.assertEquals(actual3, expected3);
	  Assert.assertEquals(actual4, expected4);
	  Assert.assertEquals(actual5, expected5);
	  Assert.assertEquals(actual6, expected6);
	  Assert.assertEquals(actual7, expected7);
	  Assert.assertEquals(actual8, expected8);
	  
  }
  @Test
  //Test Case 4: Submit the form after filling all details properly by using XPath only.
  public void submitform() {
	  String actual1= "Pratyush";// First name
	  String actual2="Samal"; // Last Name
	  String actual3= "pratyushsamal56@gmail.com"; //email
	  String actual4= "Greet Labs Pvt Limited"; //Current Company
	  String actual= "8327795369"; // Mobile Number
	  String actual5="07/28/1995"; //DOB
	  String actual6="Software QA Engineer"; //Position you are applying for
	  String actual7="http://www.pratyushsamalQA.com";// Portfolio Website
	  String actual8="6 LPA";//Salary requirements
	  WebElement firstname=driver.findElement(By.id("fnameInput"));
	  firstname.sendKeys(actual1);
	  
	  WebElement lastname=driver.findElement(By.id("lnameInput"));
	  lastname.sendKeys(actual2);
	  
	  WebElement email= driver.findElement(By.id("emailInput"));
	  email.sendKeys(actual3);
	  
	 WebElement currentcomapny=driver.findElement(By.id("curCompanyInput"));
	 currentcomapny.sendKeys(actual4);
	 
	 WebElement mobile=driver.findElement(By.id("mobInput"));
	 mobile.sendKeys(actual);
	 
	 WebElement dob= driver.findElement(By.id("DOBInput"));
	 dob.sendKeys(actual5);
	 WebElement position=driver.findElement(By.id("positionInput"));
	 position.sendKeys(actual6);
	 
	 WebElement portfolio=driver.findElement(By.id("portfolioInput"));
	 portfolio.sendKeys(actual7);
	
	 WebElement salary=driver.findElement(By.id("salaryInput"));
	 salary.sendKeys(actual8);
	 
	 WebElement resume= driver.findElement(By.id("resumeInput"));
	 resume.sendKeys("/home/pratyush/Documents/pratyush_resume.pdf");
	 
	 WebElement relocate= driver.findElement(By.id("no"));
	 relocate.click();
	 
	 WebElement submit= driver.findElement(By.xpath("//*[@type='submit']"));
	 submit.click();
  }
  @Test
  //Test Case 5: Verify DB entry after submitting the form using JDBC connection.
  public void database() throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.jdbc.Driver");
	Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3300/sourcefuse","root","selenium");
	  Statement st= conn.createStatement();
	  ResultSet rs= st.executeQuery("Select * from sourcefuseuser");
	  while(rs.next()){
		String Firstname=  rs.getString("Firstname");
		String lastname=  rs.getString("lastname");
		String currentcompany=	  rs.getString("CurrentCompany");
		String Mobile=  rs.getString("Mobile");
		String DOB=  rs.getString("DOB");
		String position= rs.getString("Position");
		String portfolio=  rs.getString("portfolio");
		String salary= rs.getString("salary");
		System.out.println(Firstname+"\n"+lastname+"\n"+currentcompany+"\n"+Mobile+"\n"+DOB+"\n"+position+"\n"+portfolio+"\n"+salary);
	  }
	  @Test
	  //Test Case 6: Verify Email is triggered or not after submitting the form using assertion on DB considering an email trigger column as email_sent.  
	  public void test() throws ClassNotFoundException, SQLException{
		  String actual_email_statement="email_sent";
		  Class.forName("com.mysql.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3300/sourcefuse","root","selenium");
			Statement stt= conn.createStatement();
			  ResultSet rss= stt.executeQuery("Select * from sourcefuseuser WHERE email_trigger='email_sent'");
			  String expected_email_statement=rss.getString("email_trigger");
			  Assert.assertEquals(actual_email_statement, expected_email_statement);
	  }
}

  @AfterMethod
  public void close() {
	  driver.close();
  }

}
