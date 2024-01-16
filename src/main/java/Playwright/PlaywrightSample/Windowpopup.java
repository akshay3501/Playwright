package Playwright.PlaywrightSample;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Windowpopup {
	
	
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium(). launch(new BrowserType.LaunchOptions().setHeadless(false));

		
		BrowserContext bx1 = browser.newContext();
		BrowserContext bx2 = browser.newContext();
		
		
		Page page1 = bx1.newPage();
		Page page2 = bx2.newPage();
		
		
		page1.navigate("https://www.google.com/");
		page2.navigate("https://www.amazon.com/");
		
}
}