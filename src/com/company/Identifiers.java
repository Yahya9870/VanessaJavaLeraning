package com.company;

public class Identifiers {
    public static void main(String[] args) {
        // Any chosen names for variables, classes, packages, method and objects etc. are known as identifiers.

        int vanessa;  // vanessa is the identifier.

        // Rules that one should follow while naming an identifier otherwise it will give error.

        // Rule 1: It Should not start with a number.

        // int 1a; error

        // Rule 2: It is case-sensitive
          int Vanessa;
          int vanessA;
          int VaNeSsa;

          // here all of the above are different variables.

        // Rule 3: It must be a keyword/reserve words of java.

        int Int; // this will not give error however not a programming practice.

        // Rule 4: It must not contain white spaces (Normal Spaces or tabs).

         // int hello  my name   is vanessa; error

        // rather you can use PascalCaseConvention, camelCaseConvention and underscores _

        int myNameIsVanessa;
        int my_name_isVanessa;

        // Rule 5: Can have numbers, underscores and special characters like $ @ etc. if above conditions are satisfied.

        int a_1;

        // Rule 6: No limit to the length of the identifiers

        int abcdefghijklmnopqrstuvwxyz123456789;

        // Question: Which of the following is/are valid identifier in Java:

        // a) int void    b) int CLASS   c) int apple  d) 123abc  e) _21a   f) int 2

        // (b, c and e are the correct choices)


    }
}
