package jeeny;

import java.net.URL;

public AndroidDriver driver;
public AppiumDriverLocalService service;

public class test {

	public static <UiAutomator2Options> void main(String[] args) {
		UiAutomator2Options options = new UiAutomator2Options();
		((Object) options).setDeviceName("Test device");
		//options.setDeviceName("R5CTC1WL2RA");
	    options.setApp(
				"C:\\Users\\Lenovo\\eclipse-workspace\\Newproject\\src\\test\\java\\Resourse\\General-Store.apk");

          AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);

	}

}
