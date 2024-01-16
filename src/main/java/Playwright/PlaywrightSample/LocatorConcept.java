package Playwright.PlaywrightSample;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorConcept {
	 public static void main(String[] args) {
	        Playwright playwright = Playwright.create();
	        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

	        // Locators
	        BrowserContext brcx1 = browser.newContext();
	        Page p1 = brcx1.newPage();
	        p1.navigate("https://www.orangehrm.com/en/contact-sales/");

	        // Single element
	        //Locator loginBtn = p1.locator("btn btn-primary loginBtn").first();

	        //Multiple element
	        Locator countryOptions = p1.locator("select#Form_getForm_Country option");
	        System.out.println(countryOptions.count());
	        
	        List<String> optionsTextList = countryOptions.allTextContents();
	        for(String e: optionsTextList) {
	        	System.out.println(e);
	        
	        }
	      

	 }
		
		
	}

