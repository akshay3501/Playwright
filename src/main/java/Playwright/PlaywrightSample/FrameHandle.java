package Playwright.PlaywrightSample;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandle {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		// Locators
		BrowserContext brcx1 = browser.newContext();
		Page p1 = brcx1.newPage();

		p1.navigate("http://www.londonfreelance.org/courses/frames/index.html");

		//1st way to handle frame locator
		//String header =p1.frameLocator("frame[name='main']").locator("h2").textContent();
		//System.out.println(header);

		//2nd way to handle using frame locator method
		//String header = p1.frame("main").locator("h2").textContent();
		//System.out.println(header);

		//3rd way to handle using Xpath
		String header =p1.frameLocator("//frame[@name='main']").locator("h2").textContent();
		System.out.println(header);

	}
}
