package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extended_Reports {

	public ExtentReports getReport() {
	
	ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//Report_folder//report.html");
	
	spark.config().setDocumentTitle("Soujit Automation test report");
	spark.config().setReportName("Report name");
	
	
	ExtentReports report = new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("name", " project name");
	
	return report;
	
	
	
	}
	
}
