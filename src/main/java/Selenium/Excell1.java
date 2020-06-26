package Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excell1 {
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
        XSSFSheet sheet = workbook.getSheet("Sheet1"); //excel --->java serialization
    //    XSSFSheet sheetWithIndex = workbook.getSheetAt(0); //same thing 0 ==Sayfa1

        System.out.println(sheet.getLastRowNum());
        System.out.println(sheet.getSheetName());
        System.out.println(sheet.getRow(0).getFirstCellNum());  //cell = column

        System.out.println(sheet.getRow(0).getLastCellNum());

        String data = sheet.getRow(0).getCell(0).getStringCellValue();
        String data1 = sheet.getRow(1).getCell(0).getStringCellValue();
        String data2 = sheet.getRow(2).getCell(0).getStringCellValue();
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);



        double datan1 = sheet.getRow(1).getCell(8).getNumericCellValue();  //getNumericCellValue() accept double click method you can see
       // double datan2 = sheet.getRow(2).getCell(5).getNumericCellValue();
      //  double datan3= sheet.getRow(2).getCell(7).getNumericCellValue();
        System.out.println(datan1);
     //   System.out.println(datan2);
       // System.out.println(datan3);



    }
}
