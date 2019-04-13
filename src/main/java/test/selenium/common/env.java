package test.selenium.common;

public class env {
	public static void setChromePath() {
		String os = System.getProperty("os.name");
		if (os.toLowerCase().startsWith("win")) {
			System.setProperty("webdriver.chrome.driver", "/Users/leon/Downloads/chromedriver");
		} else {
			System.setProperty("webdriver.chrome.driver", "/Users/leon/Downloads/chromedriver");
		}
	}
}
