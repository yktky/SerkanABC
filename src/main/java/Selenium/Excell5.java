package Selenium;

import Utils.ExcellUtils;

import java.io.IOException;

public class Excell5 {
    public static void main(String[] args) throws IOException {
        ExcellUtils ex = new ExcellUtils("C:/Users/darak/Desktop/Practice.xlsx");
        System.out.println(ex.getData(0, 1));
        System.out.println(ex.getData(1, 1));
        System.out.println(ex.getData(2, 1));
        System.out.println(ex.indexNumberOfSheet("Sheet2"));
    }
}
