package vv;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IXON {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Otvaranje linka
		WebDriver driver = new ChromeDriver();
		//USPORAVANJE
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		driver.get("https://ixonbv.recruitee.com/o/test-automation-engineer-3/c/new?source=LinkedIn");
	

		//Maximize prozora
		driver.manage().window().maximize();
		
		
		//Skrol
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
		
	    //Upload fajla - CV
	    
		String filepath = "C:\\Users\\DS\\eclipse-workspace\\WM\\docs\\DS.pdf";
		WebElement fileInput = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[1]/div/div/div[1]/input"));
	    fileInput.sendKeys(filepath);
	    
	 
	    //Full name
	    
	    //Skrol
		JavascriptExecutor jss = (JavascriptExecutor) driver;
	    jss.executeScript("window.scrollBy(0,470)", "");
	    
	    //Ime i prezime
	    WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[2]/div[1]/div/input"));
	    element.sendKeys("Dejan Simić");
	    element.submit(); 
	    
	    //Skrol
		JavascriptExecutor jsss = (JavascriptExecutor) driver;
	    jsss.executeScript("window.scrollBy(0,570)", "");
	    
	    //E-mail
	    
	    WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[2]/div[2]/div/input"));
	    element1.sendKeys("dejansimic633@gmail.com");
	    element1.submit(); 
	    
	    
	    //Skrol
	  	JavascriptExecutor jssss = (JavascriptExecutor) driver;
	  	jssss.executeScript("window.scrollBy(0,620)", "");
	  	    
	  	 //Mobile
	  	    
	  	 WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[2]/div[3]/div[1]/input"));
	  	 element2.sendKeys("+381643407285");
	  	 element2.submit(); 
	    
	  	    
		 //Skrol
		 JavascriptExecutor jsssss = (JavascriptExecutor) driver;
		 jsssss.executeScript("window.scrollBy(0,720)", "");
	  	   
		 //Rezidencija
	  	    
	  	  WebElement element3 = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[4]/div/div[1]/div/textarea"));
	  	  element3.sendKeys("Belgrade");
	  	  element3.submit(); 
	  	    
	  	  //Dostupnost
	  	    
		  WebElement element4 = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[4]/div/div[2]/div/textarea"));
		  element4.sendKeys("From 10.06.2024");
		  element4.submit();
		  	  
		  // Radni casovi
		  	  
		  WebElement element5 = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[4]/div/div[3]/div/textarea"));
		  element5.sendKeys("40+");
		  element5.submit();
		  	  
		  //English
		  	  
		  WebElement element6 = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[4]/div/div[4]/div/textarea"));
		  element6.sendKeys("intermediate (Letovanje u Grčkoj -level :)) ");
		  element6.submit();
	  	    
		  //Plata Neto
		  	  
		  WebElement element7 = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/fieldset[4]/div/div[5]/div/textarea"));
		  element7.sendKeys(" 800 EUR +++ ");
		  element7.submit();
		  	  
		  //BEZ SLANJA
		  	  
		  //WebElement element8 = driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/section/div[2]/div/div/div/div/div/div[2]/div[2]/form/div[4]/button"));
		  //element8.submit();
		  	  
		  	  
		  //Skrol
		  JavascriptExecutor jssssss = (JavascriptExecutor) driver;
		  jssssss.executeScript("window.scrollBy(0,1000)", "");
		  	  
		  //ZATVARANJE
		  //driver.close();
		  	      
	}
	

}
