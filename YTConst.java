package youtubeDownloader;

public class YTConst {
	
	//put your own testing credentials here
	public static final String USER_EMAIL = "INPUT YOUR OWN USER";
	public static final String USER_PASS = "INPUT YOUR OWN PASS";

	//Youtube Page XPaths
	public static final String SIGN_IN_BUTTON_XPATH = "xpath=//@div[class='signin-container']/button";
	public static final String MAIN_VIDEO_PANE_XPATH = "xpath=//*[@id='browse-items-primary']";
	public static final String VIDEO_LIST_PARTIAL_XPATH = MAIN_VIDEO_PANE_XPATH+ "/ol/li";
	public static final String VIDEO_LINK_POSTFIX__PARTIAL_XPATH ="/ol/li/div/div[1]/div[2]/ul/li/div/div/div/div[2]/h3/a";
	public static final String LOAD_MORE_BUTTON_XPATH = MAIN_VIDEO_PANE_XPATH + "/button";
}
