package com.edureka.readexcel;

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

	public static String[][] readDataFromExcel(String sheetName) throws Exception {

		String filePath = "D:\\Selenium\\DataProvider\\ExcelPoiTutorial.xlsx";

		File file = new File(filePath);

		workbook = WorkbookFactory.create(file);// open a workbook

		// get sheet from workbook with sheet name "Sheet1"
		Sheet sheet = workbook.getSheet(sheetName);

		// index of last row which has data
		int lastRow = sheet.getLastRowNum();

		// number of rows having data--this is not index
		int physicalNoOfRows = sheet.getPhysicalNumberOfRows();

		System.out.println("last row :" + lastRow);
		System.out.println("physical number of rosw: " + physicalNoOfRows);

		String[][] allData = new String[lastRow+1][4];
		// outer loop : to traverse each and every row
		for (int i = 0; i <= lastRow; i++) {
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
//				if (j == 2) {
//					int valu = Integer.valueOf(value);
//				}
				//store value
				allData[i][j]= value;
			}

		}
		return allData;

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
