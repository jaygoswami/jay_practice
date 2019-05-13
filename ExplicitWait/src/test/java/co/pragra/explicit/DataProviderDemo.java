package co.pragra.explicit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @Test(dataProvider = "userPassProvider")
    public void login(String name,String password){

        System.out.println("Name: "+name);
        System.out.println("Password: "+password);
    }

    @DataProvider
    public Object[][] userPassProvider(){
        Object[][] data= new Object[2][2];
        data[0][0]="jay";
        data[0][1]="jayPass";
        data[1][0]="ekta";
        data[1][1]="ektapass";
        return data;
    }
}
