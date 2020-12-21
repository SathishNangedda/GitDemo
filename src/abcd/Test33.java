package abcd;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test33 {

	    @Test(dataProvider ="Testdata")
	    public void add(String Val1, String Val2, String Val3) {
	    	
	    	int a = Integer.parseInt(Val1);
	    	
	    	int b = Integer.parseInt(Val2);
	    	
	    	int z = Integer.parseInt(Val3);
	    	
	    	int result = a+b+z;
	    	
	    	System.out.println(result);
	    	
	    }
		
		@DataProvider(name="Testdata")	
		public Object[][] readExcel() throws BiffException, IOException {
				// TODO Auto-generated method stub
				
		File f = new File("C:\\Users\\7386665666\\Desktop\\Testdata.xls");

		Workbook wb = Workbook.getWorkbook(f);

		Sheet s = wb.getSheet("Sheet1");

		int r = s.getRows();

		int c = s.getColumns();

		System.out.println(r+" "+c);

		String inputdata[][] = new String[r][c];

		for(int i=1; i<r; i++) {
			for(int j=0; j<c; j++) {
				
				
				Cell C = s.getCell(j, i);
				
				inputdata[i][j] = C.getContents();
				
				System.out.println(inputdata[i][j]);
			}
		}
		return inputdata;

	}

}
