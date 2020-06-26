package Selenium;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excell2 {
    public static void main(String[] args) throws IOException {
        //first step access the excel file
        FileInputStream file = new FileInputStream("C:/Users/darak/Desktop/Practice.xlsx");
        //if your Excell xlsx --- you will use this format XSSF
        // IF YOUR EXCEL xls ----> Or you will use HSSF
        //create object for XSSFWorkbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        System.out.println(workbook.getNumberOfSheets());

        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rownum = sheet.getLastRowNum();
        for (int i = 1; i <= rownum; i++) {
            XSSFCell cell = sheet.getRow(i).getCell(2);
            String text = "";

            if (cell.getCellType() == CellType.STRING){
                text = cell.getStringCellValue();
            }else if(cell.getCellType()==CellType.NUMERIC){
                text = String.valueOf(cell.getNumericCellValue());

                }else if (cell.getCellType()==CellType.BLANK){
                text = "";
            }
            System.out.println(text);
            }

        }
    }

