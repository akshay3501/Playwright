package Playwright.PlaywrightSample;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;

public class Fileuploadhandle {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium(). launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brContext = browser.newContext();

		Page page = brContext.newPage();
		page.navigate("https://cgi-lib.berkeley.edu/ex/fup.html");

		//select one file
		//page.setInputFiles("//input[@id='filesToUpload']", Paths.get("applogin.json"));
		//Thread.sleep(4000);
		//Remove single file
		//page.setInputFiles("//input[@id='filesToUpload']", new Path[0]);

		//Select multiple file 
		//page.setInputFiles("//input[@id='filesToUpload']", 
				//new Path [] {
		//				Paths.get("applogin.json"),
		//				Paths.get("applogin.json"),
		//				Paths.get("applogin.json")});
		//Remove multiple file 
		//page.setInputFiles("//input[@id='filesToUpload']", new Path[0]);
		
		//Run time file upload 
		page.setInputFiles("//input[@name='upfile']",new FilePayload
				("akshay.pdf", "text/plain", "This is akshay here".getBytes(StandardCharsets.UTF_8)));
		page.click("//input[@value='Press']");
	} 
}