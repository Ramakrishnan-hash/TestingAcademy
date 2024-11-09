package Nov.ex_05112024_OOPS;

public class Dog4 {
    String breed = "Pomeranian", colour = "Brown";
    float size = 3.6f;
    int age = 1;

    void eat (){
        System.out.println("Pomeranian favorite food is Chicken");
    }
    float sleep (){
        float time = 11.00f;
        return time;
    }
    int run (int run_distance_per_day){
        return run_distance_per_day;
    }
    void sit (String place){
        System.out.println("Pomeranian favorite place is : "+ place);
    }
}
