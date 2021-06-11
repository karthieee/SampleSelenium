package org.drp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\DropMethods\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();

		WebElement ddnfruit = driver.findElement(By.id("fruits"));

		Select s = new Select(ddnfruit);

		// Check Multiple option is there are not

		boolean b = s.isMultiple();
		System.out.println(b);
		
		

		s.selectByIndex(2);
		s.selectByValue("apple");
		s.selectByVisibleText("Grape");

		// Select all available in fruits

		List<WebElement> all = s.getAllSelectedOptions();
		int size = all.size();

		for (WebElement fruit : all) {
			String text = fruit.getText();
			System.out.println("All selected options" + text);

		}
		WebElement firstsel = s.getFirstSelectedOption();
		String text = firstsel.getText();
		System.out.println("First selected options" + text);

	}

}
