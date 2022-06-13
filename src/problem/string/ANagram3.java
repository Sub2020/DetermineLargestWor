package problem.string;

import java.util.Arrays;
import java.util.Comparator;


public class ANagram3 {




    public class Anagram1 {





        /*
         *
         * implement a code to find the length and longest word in the given sentence
         * should return "10" (for length), "biological" (longest word)
         *
         */

        public static void main(String[] args) {

            String str = "Human brain is a  biological learning  machine";

            String[] word = str.split(" ");
            String longword = " ";
            for (int i = 0; i < word.length; i++)
                for (int j = 1 + i; j < word.length; j++)
                    if (word[i].length() >= word[j].length())
                        longword = word[i];

            System.out.println(longword + " is the longest word with " + longword.length() + " characters.");
            System.out.println(str.length());
        }
    }

}
