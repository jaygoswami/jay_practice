package co.pragra.dd.framework.data;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilloBasedProvider {

    private String excelFileName="dataprovider.xlsx";
    public Iterator<Object[]> filloProvider(){

        Path path= Paths.get("TestData",excelFileName);
        List<Object[]> data = new  ArrayList<>();
        Fillo fillo=new Fillo();

        try {
            //fillo.getConnection(path.toString());
            Connection connection = fillo.getConnection(path.toString());
            String sql="SELECT * FROM Login";
            Recordset recordset=connection.executeQuery(sql);

            while(recordset.next()){
                List<Object> colData= new ArrayList<>();
                for(int i=0;i<recordset.getCount();i++){
                    colData.add(recordset.getField(i));
                }

                data.add(colData.toArray());


            }


        }catch (FilloException ex){
            ex.printStackTrace();
        }

        return data.iterator();
    }


}
