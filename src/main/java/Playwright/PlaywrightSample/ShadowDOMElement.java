package Playwright.PlaywrightSample;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDOMElement {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

	
		BrowserContext brcx1 = browser.newContext();
		Page p1 = brcx1.newPage();

		
		//Page --DOM-->> Shadow DOM -->elements
		//Page --DOM-->>iFrame-->>Shadow DOM -->>elements	
		p1.navigate("https://books-pwakit.appspot.com/");
		p1.locator("book-app[apptitle='BOOKS']#inputinput").fill("Testing Books");
		
		
		
		
		
	}
}