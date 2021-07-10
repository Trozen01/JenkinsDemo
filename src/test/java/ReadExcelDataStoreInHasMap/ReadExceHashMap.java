package ReadExcelDataStoreInHasMap;


import org.testng.annotations.Test;
import java.util.Map;
import java.util.Map.Entry;



public class ReadExceHashMap {
	
	@Test
	public void getTestData(){
		
		Map<String, String> testdat= ExcelReadUtility.GetExcelData();  //Read data from ExcelReadUtility and called GetExcelData method.
		
		try {

		 for (Entry<String,String> map: testdat.entrySet()) {
			System.out.println("Key is:- " +map.getKey());
			System.out.println("Value is:- "+map.getValue());
		}
	} catch (Exception e) {

	}
	}

}
