package Nov.ex_05112024_OOPS;

public class Runner_Class {
    public static void main(String[] args) {
Dog1 d = new Dog1();
Dog2 d1 = new Dog2();
Dog3 d2 = new Dog3();
Dog4 d3 = new Dog4();
Dog5 d4 = new Dog5();
        System.out.println("-------------Attributes of Dogs--------------------");
     System.out.printf("Dog1 breed name is : %s and size is : %f and colour is : %s and age is : %d \n",d.breed,d.size,d.colour,d.age );
     System.out.printf("Dog2 breed name is : %s and size is : %f and colour is : %s and age is : %d \n",d1.breed,d1.size,d1.colour,d1.age );
     System.out.printf("Dog3 breed name is : %s and size is : %f and colour is : %s and age is : %d \n",d2.breed,d2.size,d2.colour,d2.age );
     System.out.printf("Dog4 breed name is : %s and size is : %f and colour is : %s and age is : %d \n",d3.breed,d3.size,d3.colour,d3.age );
     System.out.printf("Dog5 breed name is : %s and size is : %f and colour is : %s and age is : %d \n",d4.breed,d4.size,d4.colour,d4.age );
        System.out.println("-------------Behaviour of Dogs--------------------");
        System.out.println("-------------Behaviour of Dog1--------------------");
        d.eat();
        System.out.println(d.sleep());
        System.out.println(d.run(10));
        d.sit("corridor");
        System.out.println("-------------Behaviour of Dog2--------------------");
        d1.eat();
        System.out.println(d1.sleep());
        System.out.println(d1.run(3));
        d1.sit("bed");
        System.out.println("-------------Behaviour of Dog3--------------------");
        d2.eat();
        System.out.println(d2.sleep());
        System.out.println(d2.run(7));
        d2.sit("couch");
        System.out.println("-------------Behaviour of Dog4--------------------");
        d3.eat();
        System.out.println(d3.sleep());
        System.out.println(d3.run(6));
        d3.sit("sofa");
        System.out.println("-------------Behaviour of Dog5--------------------");
        d4.eat();
        System.out.println(d4.sleep());
        System.out.println(d4.run(17));
        d4.sit("floor");
    }
}
