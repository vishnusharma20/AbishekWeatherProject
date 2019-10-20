/*
package ExcelUtil;



import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;




public class demo {

	static HSSFWorkbook wb;
	static HSSFSheet sh1;


	public static void main(String[] args) {
		try {
			File src=new File("C:\\Gir checkout\\comDataProvider\\src\\Testdata\\Testdata.xls");
			 
			FileInputStream fis=new FileInputStream(src);
			 
			  wb = new HSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  
		  sh1= wb.getSheet("login");
		  Object[][] data=new Object[sh1.getLastRowNum()][sh1.getRow(0).getLastCellNum()];
		
		  for(int i=0;i<sh1.getLastRowNum();i++)
		  {
			  for(int k=0;k<sh1.getRow(0).getLastCellNum();k++)
			  {
				  data[i][k]=sh1.getRow(i+1).getCell(k).toString();
				//  System.out.println(sh1.getRow(i+1).getCell(k).toString());
				
			  }
			  
		  }
		 */
/* for (int i = 0; i < data.length; i++) {
			
			System.out.println(data[i].toString());
		}*//*


	}

}
*/
