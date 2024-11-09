package Nov.ex_05112024_OOPS;

public class Dog2 {
    String breed = "Maltese", colour = "White";
    float size = 4.1f;
    int age = 2;

    void eat (){
        System.out.println("Maltese favorite food is Biscut");
    }
    float sleep (){
        float time = 8.00f;
        return time;
    }
    int run (int run_distance_per_day){
        return run_distance_per_day;
    }
    void sit (String place){
        System.out.println("Maltese favorite place is : " + place);
    }
}
