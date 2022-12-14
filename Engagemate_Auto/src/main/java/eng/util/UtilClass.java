package eng.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilClass 
{

	public static String TestData_Sheet_path="C:\\Users\\Cresen\\Desktop\\EngagemateExcel.xlsx";
	 

	static Workbook book;
	static Sheet sheet;
	public static Object[][] getTestData(String sheetname)
	{
		FileInputStream file =null;
	
		try {
			file = new FileInputStream(TestData_Sheet_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			try {
				book =WorkbookFactory.create(file);
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetname);
		
		Object[][]data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				
				data[i][k] = sheet.getRow(i +1).getCell(k).toString();
			}
		}
	
	return data;
}



}
