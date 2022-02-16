package pageUIs.bankGuru;

public class CommonPageUI {

	public static final String DYNAMIC_LINK = "//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX = "//td[text()='%s']/following-sibling::td/input";
	public static final String DYNAMIC_RADIO_BUTTON = "//td[text()='%s']/following-sibling::td/input[@value='%s']";
	public static final String DYNAMIC_TEXTAREA = "//td[text()='%s']/following-sibling::td/textarea";
	public static final String DYNAMIC_BUTTON = "//input[@value='%s']";
	public static final String DYNAMIC_MESSAGE = "//p[@class='heading3' and text()='%s']";
	public static final String DYNAMIC_VALUE_BY_ROW_NAME = "//td[text()='%s']/following-sibling::td";
}
