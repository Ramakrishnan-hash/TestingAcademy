package Nov.ex_11112024.criminal;
import Nov.ex_11112024.police.Cop;
public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(10); // While object creation constructor is invoked and it has access modifier as public so it's scope is within the Project
        //System.out.println(c.gun); // gun is having access modifier as default so it's scope is within the Package

    }
}
