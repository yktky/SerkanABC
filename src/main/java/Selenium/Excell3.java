package Selenium;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class Excell3 {
    public static void main(String[] args) throws IOException {
        //first step access the excel file

        FileInputStream file = new FileInputStream("C:/Users/darak/Desktop/Practice.xlsx");
        //if your Excell xlsx --- you will use this format XSSF
        // IF YOUR EXCEL xls ----> Or you will use HSSF
        //create object for XSSFWorkbook

        XSSFWorkbook workbook = new XSSFWorkbook(file);  //Workbook is the entire Excell information when you
        // see Excell: shhet1,sheet2 and into those information
        System.out.println(workbook.getNumberOfSheets());
        //GET THE SPECIFIC SHEET AND READ DATA
        XSSFSheet sheet = workbook.getSheet("Sheet2"); //excel --->java serialization
        //    XSSFSheet sheetWithIndex = workbook.getSheetAt(0); //same thing 0 ==Sayfa1

       Iterator<Row> it = sheet.iterator();
       while (it.hasNext()){
          // System.out.println(it.next().getCell(0));
           //OR
           System.out.println(it.next().getCell(7));
       }


    }
}
