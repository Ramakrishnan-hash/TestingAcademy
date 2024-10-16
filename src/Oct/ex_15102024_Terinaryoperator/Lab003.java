package Oct.ex_15102024_Terinaryoperator;

public class Lab003 {
    public static void main(String[] args) {
        int mark = 91;
        char Grade = (mark>=90)? 'A' : (mark>=80 && mark<90? 'B':(mark>=70 && mark<79)?'C':(mark>=60 && mark<69 ?'D':'F'));
        System.out.println("The Grade of the user is: "+ Grade);
    }
}
