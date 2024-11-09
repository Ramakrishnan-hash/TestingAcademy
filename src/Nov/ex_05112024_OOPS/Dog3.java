package Nov.ex_05112024_OOPS;

public class Dog3 {
    String breed = "Chow Chow", colour = "Grey";
    float size = 5.6f;
    int age = 5;

    void eat (){
        System.out.println("Chow Chow favorite food is Blueberry");
    }
    float sleep (){
        float time = 7.00f;
        return time;
    }
    int run (int run_distance_per_day){
        return run_distance_per_day;
    }
    void sit (String place){
        System.out.println("Chow Chow favorite place is : " + place);
    }
}
