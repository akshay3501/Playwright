package Playwright.PlaywrightSample;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CommaSelector {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		// Locators
		BrowserContext brcx1 = browser.newContext();
		Page p1 = brcx1.newPage();

		p1.navigate("https://academy.naveenautomationlabs.com/");
		p1.locator("a:has-text('EXPLORE COURSES").click();
		//p1.fill(null, null);
	}
}