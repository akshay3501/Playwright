package Playwright.PlaywrightSample;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Xpathlocator {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		// Locators
		BrowserContext brcx1 = browser.newContext();
		Page p1 = brcx1.newPage();

		p1.navigate("https://www.flipkart.com/");
		//p1.locator("xpath=//input[@placeholder='Search for Products, Brands and More']").fill("iphone");
		
		Locator totalflipkartlinks = p1.locator("//a[contains(text (),'Flipkart')]");
		System.out.println(totalflipkartlinks.count());
		
		List<String> textList = totalflipkartlinks.allInnerTexts();
		for(String e: textList) {
			System.out.println(e);
		}
	}
}	