package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.print.DocFlavor.STRING;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_data_excel {

	private static final boolean Number = false;

	public static void main(String[] args) throws Throwable {
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("My Love");
		Object [][] ac= { {"NAME","Relation","Place"},
						 {"NANA","NANA","NAgarajupalli"},
						 {"MAA","AMMA","Nagarajupalli"}
													};
//		int rows=ac.length;
//		int col=ac[0].length;
//		for(int i=0;i<rows;i++) {
//			XSSFRow row=sheet.createRow(i);
//			for(int j=0;j<col;j++) {
//				XSSFCell cell=row.createCell(j);
//				Object Value=ac[i][j];
//				if(Value instanceof String)
//					cell.setCellValue((String)Value);
//				if(Value instanceof Integer)
//					cell.setCellValue((Integer)Value);
//				if(Value instanceof Boolean)
//						cell.setCellValue((Boolean)Value);
//			}
//			
//		}
//		String Excel_path=".\\Data\\readdata.xlsx";
//		FileOutputStream out=new FileOutputStream(Excel_path);
//		wb.write(out);
//		out.close();
//		System.out.println("File is done");
//-------------------------------------------------------------------------
}
	}
