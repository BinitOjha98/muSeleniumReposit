package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtils 
{
	@SuppressWarnings("resource")
	@DataProvider(name="testData")
	public Object[][] testData() throws IOException 
	{
		File file = new File("C:\\Users\\IQA\\eclipse-workspace\\ZomatoFinal\\Excel\\zomatoExcel.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		// Row
		int rows = sheet.getLastRowNum();

		// Column
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

		System.out.println("Total Rows: " + rows + " Total Columns: " + cols);

		Object[][] data = new Object[rows][cols];

		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cols; j++) {
				// Cell cell = sheet.getRow(i).getCell(j); ( Optimizing )
				data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}		
		fileInputStream.close();
		return data;
		
	}

	@SuppressWarnings("resource")
	public static void writeData(String result) throws IOException 
	{
		File file = new File("C:\\Users\\IQA\\eclipse-workspace\\ZomatoFinal\\Excel\\zomatoExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = null;
		int rows = sheet.getLastRowNum();

		Cell cell = row.createCell(rows);
		cell.setCellValue(result);

		FileOutputStream fos = new FileOutputStream(
				new File("C:\\Users\\IQA\\eclipse-workspace\\ZomatoFinal\\Excel\\zomatoExcel.xlsx"));
		workbook.write(fos);
		fos.close();
		System.out.println("Everything is Done Man! Just Chill");
	}
}
