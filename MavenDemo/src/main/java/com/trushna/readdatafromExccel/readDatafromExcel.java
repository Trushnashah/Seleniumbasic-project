package com.trushna.readdatafromExccel;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDatafromExcel {
		static Workbook workbook= null;

	public static String[][] ReadDataFromExcel() throws Exception  {
		
		
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
		
		//String filepath = "C:\\Trushna\\Selenium Edureka\\Dataprovide example_username_password.xlsx";
		String filepath ="C:\\Trushna\\Selenium Edureka\\Edureka_Project_submit\\EdurekaProject_TestData.xlsx";
		
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

}
