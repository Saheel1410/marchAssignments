package practiceForm;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {
	
	
	public String[][] excelRead() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/FillDocuments.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		short cellCount = ws.getRow(1).getLastCellNum();
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				
				String values = ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(values);
				data[i-1][j] = values;
				
			}
			
		}
		wb.close();
		return data;
	}

}
