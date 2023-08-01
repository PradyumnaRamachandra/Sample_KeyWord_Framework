package excelUtility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import utility.Constants;

public class ExcelLibrary {
	
	public ArrayList<String> read_keyword() throws Exception, IOException {
		
		File file=new File(Constants.file);
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet=book.getSheet("DWS");
		ArrayList<String> a=new ArrayList();
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=1;i<row_count;i++) {
				String value=sheet.getRow(i).getCell(4).toString();
				a.add(value);
			}
		
		return a;
			
		}
		
		
		
	}
	


