package taste.Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface Constant {

    public String EUpageURL="https://dev.12taste.com/";
	
	String INpageURL="https://www.12taste.com/in/my-account/";
	
	final public static String screenShotPath=System.getProperty("user.dir") + File.separator+"screenshort"+File.separator+"screenshort"+System.currentTimeMillis();
	
	final public static String excelSheetsPath="C:\\Users\\sures\\OneDrive\\Desktop\\Aug_Camp.xlsx";
	
	final public static String reportpath =System.getProperty("user.dir") + File.separator+"reports"+File.separator+"Automation Report.html";
	
	final public static int longWait=10;
	
	final public static int mediumWait=10;

	final public static int shortWait=10;
	
	final public static int longSleep=3000;
	
	final public static int mediumSleep=2000;
	
	final public static int shortSleep=1000;
	
//	 String timestamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	
	final public static String screenShotFileName="\\screen";
	
	final public static String screenShotPNGExtension=".png";
	
	final public static String screenShotJPEGExtension=".jpeg";
}
