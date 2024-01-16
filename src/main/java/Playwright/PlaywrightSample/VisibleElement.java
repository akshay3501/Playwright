package Playwright.PlaywrightSample;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VisibleElement {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		// Locators
		BrowserContext brcx1 = browser.newContext();
		Page p1 = brcx1.newPage();

		p1.navigate("https://www.amazon.com/");
		List<String>linkText = p1.locator("a:visible").allInnerTexts();

		for(int i=0; i<linkText.size();i++) {
			System.out.println(linkText.get(i));
		}
	}
}