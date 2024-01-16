package Playwright.PlaywrightSample;

import org.xml.sax.Locator;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ReactElement {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		// Locators
		BrowserContext brcx1 = browser.newContext();
		Page p1 = brcx1.newPage();

		p1.navigate("https://www.netflix.com/in/");
		
		Locator email = (Locator) p1.locator("_react=p[name='email']>> input").first();
        
}
}