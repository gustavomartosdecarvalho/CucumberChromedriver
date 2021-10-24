package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.WebDriverFactory;


// Translate Method names and variables
public class UtilSelenium {

	public static WebDriver driver;
	public WebElement elemento;
	
	public UtilSelenium() {
		driver = WebDriverFactory.getDriver();
	}
	
	public boolean ElementoExibido(By by) {
		boolean resposta = false;
		try {
			resposta = driver.findElement(by).isDisplayed();
		} catch(NoSuchElementException e) {
			resposta = false;
		}
		return resposta;
	}
	
	public void Escrever(By by, String keysToSend) {
		try {
			driver.findElement(by).sendKeys(keysToSend);
		} catch(NoSuchElementException e){
			
		}
	}
	
	public void Clicar(By by) {
		try {
			driver.findElement(by).click();
		} catch (NoSuchElementException e) {
			
		}
	}

	public void PressionarEnter(By by) {
		try {
			driver.findElement(by).sendKeys(Keys.ENTER);
		} catch(NoSuchElementException e){
			
		}
	}
}
