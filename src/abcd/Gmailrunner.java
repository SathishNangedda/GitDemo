package abcd;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Gmailrunner {
	
	public static void main(String[] args) throws BiffException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, RowsExceededException, WriteException
	{
		//Open Excel File(.xls) for Reading TestData
		File f = new File("D:\\testsandsteps.xls");
		Workbook rwb = Workbook.getWorkbook(f);
		Sheet rsh1 = rwb.getSheet(0);// to Read from Sheet1(index=0)
		int not = rsh1.getRows();
		
		Sheet rsh2 = rwb.getSheet(1); // to Read & Write in Sheet2
		int nos = rsh2.getRows();
		int nouc = rsh2.getColumns();
	
		
//		Open Same Excel File for Writing TestResult
		WritableWorkbook wwb = Workbook.createWorkbook(f,rwb);
		WritableSheet wsh = wwb.getSheet(1);
		
//		Instantiate methods class
		Gmailmethods gm = new Gmailmethods();
//		Collect All the methods of methods class into an Array of type Method
		Method m[] = gm.getClass().getMethods();
		
		for(int i=1;i<not;i++)
		{
			String tid = rsh1.getCell(0,i).getContents();
			String mode = rsh1.getCell(2,i).getContents();
			if(mode.equalsIgnoreCase("yes"))
			{
				for(int j=1;j<nos;j++)
				{
					String sid = rsh2.getCell(0,j).getContents();
					if(tid.equalsIgnoreCase(sid))
					{
						String mn = rsh2.getCell(2,j).getContents();
						String o = rsh2.getCell(3,j).getContents();
						String d = rsh2.getCell(4,j).getContents();
						String c = rsh2.getCell(5,j).getContents();
						
						for(int k=0;k<m.length;k++)
						{
							//if method present in Method array iw equals to method of Excel Sheet2 Then execute that method
							if(m[k].getName().equals(mn))
							{
								String r = (String)m[k].invoke(gm,o,d,c);
								Label l = new Label(nouc,j,r);
								wsh.addCell(l);
								
							}
						}
					}
				}
			}
		}
//Save Excel File
		wwb.write();
//Close WritableWorkbook and then (Readable)Workbook
		wwb.close();
		rwb.close();

	}


}
