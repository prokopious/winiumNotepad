package winiumNotepad.winiumNotepad;

import java.net.URL;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class App {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesktopOptions option = new DesktopOptions();

		option.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
		Thread.sleep(5000);
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);

		Thread.sleep(5000);
	
		driver.findElement(By.name("Notepad")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
