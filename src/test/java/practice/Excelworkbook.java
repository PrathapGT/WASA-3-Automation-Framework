package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelworkbook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\test-case-templates (2).xls");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		
		String orgname = wb.getSheet("Test Case Template 1").getRow(1).getCell(2).getStringCellValue();
		
		
		System.out.println("data entered");
	}

}
