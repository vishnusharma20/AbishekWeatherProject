package ExcelUtil;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class Getdata {
	
	static HSSFWorkbook wb;
	static HSSFSheet sh1;

	public static Object[][] getTestData(String fileName, String sheetName) throws IOException{
	Object[][] arrayExcelData = null;

		try {
			File src=new File(fileName);
			 
			FileInputStream fis=new FileInputStream(src);
			wb = new HSSFWorkbook(fis);
			sh1=wb.getSheet(sheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int totalNoOfRows = sh1.getPhysicalNumberOfRows();
		int totalNoOfCols = sh1.getRow(0).getLastCellNum();


		arrayExcelData=new Object[totalNoOfRows][totalNoOfCols];
		  
		  for(int i=0;i<totalNoOfRows;i++)
		  {
			  for(int k=0;k<totalNoOfCols;k++)
			  {
				  arrayExcelData[i][k]=sh1.getRow(i).getCell(k).toString();
				  System.out.println(sh1.getRow(i).getCell(k).toString());
			  }
		  }
		return arrayExcelData;
	}

}
