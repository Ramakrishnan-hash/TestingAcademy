package Oct.ex_22102024_Loops;

import java.util.Scanner;

public class vowels_and_consonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value");
        String value = s.next().toLowerCase();
        int vowel = 0, consonant = 0;
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            if (character >= 'a' && character <= 'z') {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonant: " + consonant);
        s.close();
    }
}
