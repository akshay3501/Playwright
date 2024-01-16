package Playwright.PlaywrightSample;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class JspopupHandle {
	public static void main(String[] args){
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium(). launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.onDialog(dialog -> {
		String text = dialog.message();
		System.out.println(text);
		dialog.accept("Hi this is my Alert from thinkitive technologies pvt ltd");
		//dialog.dismiss();

		//JS Alerts, Prompt, Confirmation pop ups
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		page.click("//button[text()='Click for JS Alert']");
		page.click("//button[text()='Click for JS Confirm']");
		page.click("//button[text()='Click for JS Prompt']");

		String result = page.textContent("#result");
		System.out.println(result);

		page.close();
		browser.close();
		playwright.close();

		});
}
}
