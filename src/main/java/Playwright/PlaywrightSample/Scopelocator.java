package Playwright.PlaywrightSample;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Scopelocator {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		// Locators
		BrowserContext brcx1 = browser.newContext();
		Page p1 = brcx1.newPage();

		p1.navigate("https://primeng.org/");

		Locator row = p1. locator("p-selectable-row");
		row. locator(":scope", new Locator.LocatorOptions() .setHasText("James Butt") ) . locator(". p-checkbox p-component")
		.click();
}
}

