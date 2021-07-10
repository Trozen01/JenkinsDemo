package ReadExcelDataStoreInHasMap;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {
	
	public static Map<String, String> GetExcelData(){
		HashMap<String, String> testdata = new HashMap<String, String>();
		
		try {
	
			File exlpath = new File("C:\\Jitu\\Work\\SoftwareTesting\\Practical\\DataRead\\src\\com\\data\\util\\HashMap.xlsx");

			FileInputStream fis = new FileInputStream(exlpath);

			XSSFWorkbook workbok = new XSSFWorkbook(fis);    //load full workbook.   
			
		    XSSFSheet sheet1=	workbok.getSheetAt(0);    // read first sheet from workbook.
		    
		    int Rowcount = sheet1.getLastRowNum();

			for(int i = 0; i<=Rowcount; i++){
				Row row =sheet1.getRow(i);
				
				Cell keycell = row.getCell(0);
				String key = keycell.getStringCellValue().trim();
				
				Cell valuecell = row.getCell(1);
				String value = valuecell.getStringCellValue().trim();
				testdata.put(key, value);
			}
		    
		    
		} catch (Exception e) {

		}
		
		
			
		return testdata;
		
		
	}

}
