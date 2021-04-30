package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetValueFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("C:\\Users\\Indium Software\\Desktop\\dataDriven.xlsx");
		
		XSSFWorkbook xs = new XSSFWorkbook(fi);
		
		XSSFSheet xf = xs.getSheet("Data1");
		Iterator<Row> rows = xf.iterator();
		Row FirstRow = rows.next();
		Iterator<Cell> cells = FirstRow.cellIterator();
		while(cells.hasNext())
		{
			System.out.println(cells.next());
		}
		
		
		
		}

}
