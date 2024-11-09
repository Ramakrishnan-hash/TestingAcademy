package Nov.ex_06112024;

public class Constructor_Overloading {
    public static void main(String[] args) {
        Constructor1 cs1 = new Constructor1();
        Constructor1 cs2 = new Constructor1("David");
        Constructor1 cs3 = new Constructor1("Scott","Windy");
        Constructor1 cs4 = new Constructor1("Steve","Smith", 34);
        System.out.printf("Age of %s%s is %d \n",cs1.First_name,cs1.Last_name,cs1.age);
        System.out.printf("Age of %s%s is %d \n",cs2.First_name,cs2.Last_name,cs2.age);
        System.out.printf("Age of %s%s is %d \n",cs3.First_name,cs3.Last_name,cs3.age);
        System.out.printf("Age of %s%s is %d \n",cs4.First_name,cs4.Last_name,cs4.age);
    }
}

class Constructor1{
    String First_name, Last_name;
    int age;
    Constructor1(){
        First_name = "Mark";
        Last_name = "Wood";
        age = 27;
    }
    Constructor1(String FN){
        this.First_name = FN;
    }
    Constructor1(String FN, String LN){
        this.First_name = FN;
        this.Last_name = LN;
    }
    Constructor1(String FN, String LN, int age){
        this.First_name = FN;
        this.Last_name = LN;
        this.age = age;
    }
}
