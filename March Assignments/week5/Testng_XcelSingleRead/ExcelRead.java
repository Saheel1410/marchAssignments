package testng_readExcl;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public String[][] readExcel() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLeadNew.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		short cellCount = ws.getRow(1).getLastCellNum();
		
		String[][] data = new String[rowCount][cellCount];
		
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j <cellCount; j++) {
				String values = ws.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j]=values;
			}
			
		}
		return data;

	}

}
