package TestNgPractice;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	static Workbook workbook = null;
	public static String[][] readDataFromExcel() throws Exception  {
	//public static void main(String[] args) throws Exception {

		String filePath = "C:\\Trushna\\Selenium Edureka\\Edureka_Project_submit\\EdurekaProject_TestData.xlsx";

		File file = new File(filePath);

		workbook = WorkbookFactory.create(file);// open a workbook

		// get sheet from workbook with sheet name "Sheet1"
		Sheet sheet = workbook.getSheet("Register");

		// index of last row which has data
		int lastRow = sheet.getLastRowNum();

		// number of rows having data--this is not index
		int physicalNoOfRows = sheet.getPhysicalNumberOfRows();

		System.out.println("last row :" + lastRow);
		System.out.println("physical number of rosw: " + physicalNoOfRows);
		String[][] alldata = new String[lastRow+1][11];
		
		// outer loop : to traverse each and every row
		for (int i = 1; i <= lastRow; i++) {
			Row row = sheet.getRow(i);

			if (row == null) {
				// as row doesn't have data don't execute next statements
				continue;
			}
			// last cell number
			int lastCellNum = row.getLastCellNum();

			// physical number of rows
			int phyNoOfcells = row.getPhysicalNumberOfCells();

//			System.out.println("last cell Number: " + lastCellNum);
//			System.out.println("physical number of rows: " + phyNoOfcells);

			// Inner loop : to traverse each and every cell in a row
			for (int j = 0; j < lastCellNum; j++) {

				Cell cell = row.getCell(j);

				if (cell == null) {
					// As there is no data defined in this cell, no need to
					// getting cell value
					continue;
				}
				String value = getCellValue(cell);
				System.out.println("i :"+ i + " j: "+ j+ " Cell VAlue : " + value);
				alldata[i][j]= value;
//				if (j == 2) {
//					int valu = Integer.valueOf(value);
//				}
			}
			
		}
		return alldata;

	}

	private static String getCellValue(Cell cell) {

		CellValue cellvalue = evaluateForumla(cell);

		if (cellvalue == null) {
			return null;
		}

		if (cellvalue.getCellType() == Cell.CELL_TYPE_BLANK) {
			return cellvalue.getStringValue();
		} else if (cellvalue.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(cellvalue.getBooleanValue());
		} else if (cellvalue.getCellType() == Cell.CELL_TYPE_STRING) {
			return cellvalue.getStringValue();
		} else if (cellvalue.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			return String.valueOf(cellvalue.getNumberValue());
		} else if (cellvalue.getCellType() == Cell.CELL_TYPE_FORMULA) {
			// formula is already evaluated so throw error
			return null;
		} else if (cellvalue.getCellType() == Cell.CELL_TYPE_ERROR) {
			return cellvalue.getStringValue();
		}

		return null;
	}

	private static CellValue evaluateForumla(Cell cell) {

		FormulaEvaluator eva = workbook.getCreationHelper()
				.createFormulaEvaluator();
		CellValue cellValue = eva.evaluate(cell);

		return cellValue;
	}
}




























/*import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
		static Workbook workbook= null;

	public static String[][] readDataFromExcel() throws Exception  {
		
		
		//1.Give filepath in string.
		//2. declare file.
		//3. workbook
		//4. Sheet: get sheet from workbook with sheet name "Sheet1"
		//5. lastrow: index of last row which has data
		//6. physicalnoof row: number of rows having data--this is not index
		//7. outer loop : to traverse each and every row
		//8. as row doesn't have data don't execute next statements
		//9. last cell number
		//10. physical number of rows
		//11. Inner loop : to traverse each and every cell in a row
		//12. As there is no data defined in this cell, no need to getting cell value
		//13. evaluate formula
		
		String filepath = "C:\\Trushna\\Selenium Edureka\\Dataprovide example_username_password.xlsx";
		
		File file =new File(filepath);
		
		 workbook =WorkbookFactory.create(file);
		Sheet sheet =workbook.getSheet("Login");
		
		int lastRow = sheet.getLastRowNum();
		int physicalNoOfRows= sheet.getPhysicalNumberOfRows();
		
		System.out.println("Last Row :"+ lastRow);
		System.out.println("PhysicalNoOfRows" + physicalNoOfRows);
		String[][] allData =new String[lastRow+1][2];
		
		for(int i=1; i<=lastRow;i++) {
			
			Row row = sheet.getRow(i);
			
			if(row == null) {
			
				continue;
			}
			
			int lastCellNum = row.getLastCellNum();
			
			int phyNooflastcell = row.getPhysicalNumberOfCells();
			
			System.out.println("last cell number:" + lastCellNum);
			
			System.out.println("physical no of cells" + phyNooflastcell );
			
			
			
			for (int j=0;j<lastCellNum;j++) {
				 Cell cell= row.getCell(j);
				 if(cell == null) {
					 continue;
					  }
			String value = getCellvalue(cell);
			System.out.println("i :"+ i +" j :"+ j +"cell value :" + value);
			
			allData[i][j]= value;
			}
		
		}
		return allData;
		}
	
		private static String getCellvalue(Cell cell) {
			CellValue cellvalue= evaluateFormula(cell);
			if(cellvalue == null) {
				return null;
			}
			if(cellvalue.getCellType()==Cell.CELL_TYPE_BLANK) {
				return cellvalue.getStringValue();
				}else if(cellvalue.getCellType()==Cell.CELL_TYPE_BOOLEAN) {
					return String.valueOf(cell.getBooleanCellValue());
				}else if(cellvalue.getCellType()==Cell.CELL_TYPE_STRING) {
					return cell.getStringCellValue();
				}else if(cellvalue.getCellType()==Cell.CELL_TYPE_FORMULA) {
					return cell.getCellFormula();
				}else if(cellvalue.getCellType()==Cell.CELL_TYPE_NUMERIC) {
				 return String.valueOf(cell.getNumericCellValue());
				}else if (cellvalue.getCellType()==Cell.CELL_TYPE_ERROR) {
					return cellvalue.getStringValue();
				}
			return null; 
			}
		
		private static CellValue evaluateFormula(Cell cell) {
			
			FormulaEvaluator eva = workbook.getCreationHelper().createFormulaEvaluator();
			
		CellValue cellvalue =eva.evaluate(cell);
		return cellvalue;
		
		
		
		
	}

}*/
