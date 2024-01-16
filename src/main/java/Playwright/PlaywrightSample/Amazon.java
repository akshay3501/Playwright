package Playwright.PlaywrightSample;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Amazon {
	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
					.setHeadless(false));
			BrowserContext context = browser.newContext();
			Page page = context.newPage();
			page.navigate("https://www.amazon.in/");
			page.getByPlaceholder("Search Amazon.in").fill("iphone");
			page.getByPlaceholder("Search Amazon.in").press("Enter");
			page.getByLabel("Go to page 2").click();
			page.getByLabel("Go to page 3").click();
			page.getByLabel("Go to page 4").click();
			page.getByLabel("Go to page 5").click();
			page.getByLabel("Go to page 6").click();
			page.getByLabel("Go to page 7").click();
			page.getByLabel("Go to page 8").click();
			page.getByLabel("Go to page 9").click();
			page.getByLabel("Go to page 10").click();
			page.getByLabel("Go to page 11").click();
			page.getByLabel("Go to page 12").click();
			page.getByLabel("Go to page 13").click();
		}
	}
}

