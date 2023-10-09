package cusKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.apache.commons.io.FilenameUtils;
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

@Keyword

public boolean isFileDownloaded(fileName) {

	//	String userHome = System.getenv( 'userprofile' );
	String downloadPath = "C:/Users/TDS/Downloads";
	//	userHome + File.separator + "Downloads"
	System.out.println(fileName);
	//	System.out.println("downloadPath=" + downloadPath);

	File dir = new File(downloadPath);
	File[] dirContents = dir.listFiles();
	String lastAttempt = "";
	if (dirContents.length > 0) {
		for (int i = 0; i < dirContents.length; i++) {
			System.out.println(FilenameUtils.removeExtension(dirContents[i].getName()));
			if (FilenameUtils.removeExtension(dirContents[i].getName()).matches(fileName)) {
				// File has been found, it can now be deleted:
				dirContents[i].delete();
				System.out.println("File found");
				//				KeywordUtil.markPassed('File exist in ' + downloadPath + ' and was deleted')
				return true;
			}
			lastAttempt = dirContents[i].getName().matches(fileName);
		}
		if (lastAttempt != fileName) {
			KeywordUtil.markFailed('File does not exist in ' + downloadPath)
			return false;
		}
	}
	return false;
}