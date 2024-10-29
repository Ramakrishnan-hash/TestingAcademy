package Oct.ex_28102024_StringFunctions;

import java.util.Scanner;

public class String_Functions {
    public static void main(String[] args) {
        String original_value = "I love mango";
        String trim_value = "  Mathew    ";
        //Length
        int total_length = original_value.length();
        //Upercase
        String upper_case = original_value.toUpperCase();
        //Lowercase
        String lower_case = original_value.toLowerCase();
        //Substring
        String substring = original_value.substring(7);
        //trim
        String trim = trim_value.trim();
        //replace
        String replace = original_value.replace("I", "A");
        //equals
        boolean equals = original_value.equals(upper_case);
        //equals Ignore Case
        boolean equals_ignore_case = original_value.equalsIgnoreCase(upper_case);
        //charAt
        char index = original_value.charAt(7);
        //Concat
        String concat = original_value.concat(upper_case).concat(lower_case);
        //Contains
        boolean contains = original_value.contains("love");
        System.out.println(total_length);
        System.out.println(upper_case);
        System.out.println(lower_case);
        System.out.println(substring);
        System.out.println(trim);
        System.out.println(replace);
        System.out.println(equals);
        System.out.println(equals_ignore_case);
        System.out.println(index);
        System.out.println(concat);
        System.out.println(contains);
    }
}
