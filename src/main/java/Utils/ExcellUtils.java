package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcellUtils {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    public ExcellUtils(String excellPath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(excellPath);
        workbook = new XSSFWorkbook(fileInputStream);

    }

    public String getData(int rownum,int column){
        sheet = workbook.getSheetAt(2);  //Sayfa1  --0 index,  Sheet1 --index1,  Sheet2--->index2
        String data =sheet.getRow(rownum).getCell(column).getStringCellValue();
        return data;

    }
    public int indexNumberOfSheet(String numberOfSheet){
        int index =workbook.getSheetIndex(numberOfSheet);
        return index;

    }
}
