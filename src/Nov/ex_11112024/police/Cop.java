package Nov.ex_11112024.police;

public class Cop {
    int gun;
    String icard;

    // Parmeterized Constructor
   public Cop(int gun){
        this.gun = gun;
    }
// Normal method -- No returning & No parameters
    void canI_shoot(){
        System.out.println("Yes since you are the police you can shoot -- present in Cop class with normal method");
    }
}
