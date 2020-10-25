

//reading value of a particular cell  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
public class ReadCellExample   
{  
	static ArrayList<String> values = new ArrayList<String>();

public static void main(String[] args)   
{  
@SuppressWarnings("unused")
ReadCellExample rc=new ReadCellExample();   //object of the class  
//reading the value of 2nd row and 2nd column  
ReadCellData();   
System.out.println(values);  
}  
//method defined for reading a cell  
@SuppressWarnings("deprecation")
public static void ReadCellData()  
{  
//String value=null;          //variable for storing the cell value  
Workbook wb=null;           //initialize Workbook null  
try  
{  
//reading data from a file in the form of bytes  
FileInputStream fis=new FileInputStream("C:\\\\Users\\\\achre\\\\OneDrive\\\\Bureau\\\\U2000.xlsx");  
//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
wb=new XSSFWorkbook(fis);  
}  
catch(FileNotFoundException e)  
{  
e.printStackTrace();  
}  
catch(IOException e1)  
{  
e1.printStackTrace();  
}  
Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
Iterator<Row> itr = sheet.iterator();
while (itr.hasNext())                 
{  
Row row = itr.next();  
//Row row=sheet.getRow(vRow); //returns the logical row  
Cell cell=row.getCell(2); //getting the cell representing the given column  
if(cell==null || cell.getCellTypeEnum()== CellType.BLANK) {
	values.add(" ");
}else {
switch (cell.getCellType())               
{  
case STRING:    //field that represents string cell type  
	values.add(cell.getStringCellValue());  
break;  
case NUMERIC:    //field that represents number cell type  
	values.add(Integer.toString((int) cell.getNumericCellValue()));  
break;  
default:  
}  }}
//return value;               //returns the cell value  
}  

}
