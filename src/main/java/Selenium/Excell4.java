package Selenium;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Excell4 {
    public static void main(String[] args) throws IOException {
        Excell4 obj = new Excell4();
        obj.ReadData(0);

    }

    public void ReadData(int column) throws IOException {
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
        List<String> list = new ArrayList<>();
        while (it.hasNext()){
            list.add(it.next().getCell(column).getStringCellValue());
        }
        System.out.println(list);
    }
}