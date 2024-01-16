package Playwright.PlaywrightSample;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContextConcept {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium(). launch(new BrowserType. LaunchOptions().setHeadless(false) );
		BrowserContext brcx1 = browser.newContext();
		Page p1 = brcx1.newPage();
		p1.navigate("https://academy.naveenautomationlabs.com/");
		//p1.fill("#Form_submitForm_Name", "Naveen");
		System.out.println(p1.title());

		BrowserContext brcx2 = browser.newContext();
		Page p2 = brcx2.newPage();
		p2.navigate("https://www.amazon.com/");
		p2. fill("#search_query_top", "Dress");
		System.out.println(p2.title());

		BrowserContext brcx3 = browser.newContext();
		Page p3 = brcx3.newPage();
		p3.navigate("http://google.com/");
		System.out.println(p3.title());
		p1.close();
		brcx1.close();

		p2.close();
		brcx2.close();

		p3.close();
		brcx3.close();
	}
}