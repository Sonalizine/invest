package baseClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.guru99_bank.configurations.Config;

public class readexcelsheet {
	public String testdata(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(Config.testdatapath);
		
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	    
		return data;
		
		
	}

}
