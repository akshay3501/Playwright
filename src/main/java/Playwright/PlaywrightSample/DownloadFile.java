package Playwright.PlaywrightSample;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium(). launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brContext = browser.newContext();

		Page page = brContext.newPage();
		page.navigate("https://chromedriver.storage.googleapis.com/index.html?path=102.0.5005.27/");

		//Download file 
		Download download = page.waitForDownload(() ->{
			page.click("xpath=//a[normalize-space()='chromedriver_mac64_m1.zip']");
		});
		System.out.println(download.url());
		
		String path = download.path().toString();
		System.out.println(path);
		download.saveAs(Paths.get("Akshay_chrome.zip"));
	}
}