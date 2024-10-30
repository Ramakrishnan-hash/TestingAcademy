package Oct.ex_29102024_duplicates_in_an_array;

public class Duplicate_Array_using__normal_method {
    public static void main(String[] args) {
        String names [] = {"John","Scott","David","Mathew","John"};
        boolean result = Duplicate_check(names);
        if (result){
            System.out.println("Duplicate value is present in Array");
        }
        else {
            System.out.println("Duplicate value is not present in Array");
        }
    }
    static boolean Duplicate_check(String array[]){
        for(int i =0; i<array.length;i++){
            for(int j= i +1;j<array.length;j++){
                if (array[i] == array[j]) {
                  return true;
                }
            }
        }
        return false;
    }
}
