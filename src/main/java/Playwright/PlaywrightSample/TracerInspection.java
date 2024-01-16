package Playwright.PlaywrightSample;


import java.nio.file.Paths;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;


public class TracerInspection {
	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
					.setHeadless(false));
			BrowserContext context = browser.newContext();
			
			// Start tracing before creating / navigating a page.
			context.tracing().start(new Tracing.StartOptions()
			  .setScreenshots(true)
			  .setSnapshots(true)
			  .setSources(true));
			
			Page page = context.newPage();
			page.navigate("https://academy.naveenautomationlabs.com/");
			page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
			page.frameLocator("#microfe-popup-login").getByText("Sign up").click();
			page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").click();
			page.frameLocator("#microfe-popup-login").getByPlaceholder("Name").fill("akshay");
			page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").click();
			page.frameLocator("#microfe-popup-login").getByPlaceholder("Email address").fill("abc123@gmail.com");
			page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").click();
			page.frameLocator("#microfe-popup-login").getByPlaceholder("Password").fill("Pass@1234");
			page.frameLocator("#microfe-popup-login").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Next")).click();
			page.frameLocator("#microfe-popup-login").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("India: +")).click();
			page.frameLocator("#microfe-popup-login").getByRole(AriaRole.OPTION, new FrameLocator.GetByRoleOptions().setName("India+")).click();
			page.frameLocator("#microfe-popup-login").getByPlaceholder("Enter your number").click();
			page.frameLocator("#microfe-popup-login").getByPlaceholder("Enter your number").fill("+91 85263-9562");
			page.frameLocator("#microfe-popup-login").getByText("Before you get startedFields").click();
			page.frameLocator("#microfe-popup-login").locator("#loginPopupCloseBtn svg").click();
			page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
			page.frameLocator("#microfe-popup-login").locator("#loginPopupCloseBtn path").click();
			
			
			// Stop tracing and export it into a zip archive.
			context.tracing().stop(new Tracing.StopOptions()
			  .setPath(Paths.get("trace.zip")));
		}
	}
}



