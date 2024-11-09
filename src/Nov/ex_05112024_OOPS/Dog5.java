package Nov.ex_05112024_OOPS;

public class Dog5 {
    String breed = "German Shepherd", colour = "White and Black";
    float size = 7.6f;
    int age = 4;

    void eat (){
        System.out.println("German Shepherd favorite food is Fruits");
    }
    float sleep (){
        float time = 12.00f;
        return time;
    }
    int run (int run_distance_per_day){
        return run_distance_per_day;
    }
    void sit (String place){
        System.out.println("German Shepherd favorite place is : "+ place);
    }
}
