package Nov.ex_06112024;

public class Default_Constructor {
    public static void main (String [] args){
        Constructor obj = new Constructor();
        System.out.printf("Age of %s%s is %d",obj.First_name,obj.Last_name,obj.age);
    }
}

class Constructor {
    String First_name, Last_name;
    int age;

    Constructor(){
        First_name = "Mark";
        Last_name = "Wood";
        age = 27;
    }

}