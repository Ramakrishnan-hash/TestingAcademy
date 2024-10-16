package Oct.ex_14102024_TypeCasting;

public class Lab001_TypeCasting {
    public static void main(String[] args) {
       /* Real-Life Example
 Here's a real-life example of type casting where we create a program to calculate the percentage
 of a user's score in relation to the maximum score in a game.

 We use type casting to make sure that the result is a floating-point value, rather than an integer:
        */
int max_score = 500, user_score = 461;

double total_percentage = (double)user_score/max_score*100.00d;

System.out.println("The total Percentage of the user is: "+ total_percentage);
    }
}
