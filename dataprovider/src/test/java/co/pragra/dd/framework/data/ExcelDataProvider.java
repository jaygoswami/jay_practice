package co.pragra.dd.framework.data;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ExcelDataProvider {
    /* This file should eist in your testdata directory*/

    private String excelFileName="dataprovider.xlsx";
    /*
    *
    * This method will return the Iterator from List<Object[]>
    * */

    @DataProvider
    public Iterator<Object[]> excelDP(){
        List<Object[]> data=new ArrayList<>();//main data list
        //file path to read file
        Path path= Paths.get("TestData",excelFileName);


        try {
            //Read file as inputstream
            InputStream inputStream = new FileInputStream(path.toFile());

            //create excel workbook
            Workbook workbook = new XSSFWorkbook(inputStream);

            //create the excel sheet
            Sheet sheet = workbook.getSheet("Demo");

            //Sheet has rows and cells, first loop through rows
            Iterator<Row> rowIterator =sheet.rowIterator();


            while (rowIterator.hasNext()){
                //next() will return actual row
                Row row = rowIterator.next();

                //we got row in row variable, now we will create Object Array

                List<Object> cellData=new ArrayList<>();
                ///to loop through cells we need Iterator

                Iterator<Cell> cellIterator=row.cellIterator();
                //while loop to get allthe values
                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();

                    if(cell.getCellTypeEnum()== CellType.NUMERIC){
                       cellData.add(cell.getNumericCellValue());
                    }
                    if(cell.getCellTypeEnum()== CellType.STRING){
                        cellData.add(cell.getStringCellValue());
                    }

                }
                data.add(cellData.toArray());

            }

        }catch (IOException ex){
            ex.printStackTrace();
        }
        return data.iterator();
    }
}

















