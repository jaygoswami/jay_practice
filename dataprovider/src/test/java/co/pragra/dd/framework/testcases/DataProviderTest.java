package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.data.FilloBasedProvider;
import co.pragra.dd.framework.data.ExcelDataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

@Test(dataProviderClass = ExcelDataProvider.class,dataProvider="excelDP")
public void excelDPtest(Object name1,Object name2,Object name3,Object name4){

    System.out.println(name1);
    System.out.println(name2);
    System.out.println(name3);
    System.out.println(name4);
}


@Test(dataProvider ="filloProvider",dataProviderClass = FilloBasedProvider.class)
    public void filloTest(String a1,String a2,String a3,String a4){

    System.out.println(a1+a2+a3+a4);

}
}


