package Datahandling;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead 
{
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("F:\\H\\Selenium_Automation\\data\\Testdata.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	wb.close();
	System.out.println(wb.getsheetAt(0).getcell();
}
}
