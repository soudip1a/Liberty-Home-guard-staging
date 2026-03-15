package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extended_Reports {

	public ExtentReports getReport() {
	
	ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//Report_folder//report.html");
	
	spark.config().setDocumentTitle("Automation Test Report");
	spark.config().setReportName("Liberty HomeGaurd Automation Report");
	spark.config().setTheme(Theme.DARK);
	spark.config().setTimelineEnabled(true);
	spark.config().setCss(".bagde {font-size: 12; padding: 4px; }");
	
	ExtentReports report = new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("Automated By", "Soudip Automation Test Lead");
	report.setSystemInfo("Framework","Selenium + TestNg");
	report.setSystemInfo("Report Type" ,"Extent Spark HTML" );
	report.setSystemInfo("OS",System.getProperty("os.name"));
	report.setSystemInfo("Java Version",System.getProperty("java.version"));
	return report;
	
	
	
	}
	
}
