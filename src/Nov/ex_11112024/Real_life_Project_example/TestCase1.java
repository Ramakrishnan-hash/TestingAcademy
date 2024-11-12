package Nov.ex_11112024.Real_life_Project_example;

import java.sql.SQLOutput;

public class TestCase1 extends Base_Class {

    // Default constructor of TestCase1 class

   public TestCase1(){
        System.out.println("Default constructor of TestCase1 class");
    }

   public void First_method(){
        openbrowser("Chrome");
        openbrowser();
        closebrowser();
    }
    @Override
    public void setBrowser(String browser, boolean auth) {
        System.out.println("My code in set browser method");
        super.setBrowser("Chrome", true);
        super.setBrowser("FireFox", true);
    }
}
