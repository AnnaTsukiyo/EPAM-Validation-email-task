package com.epam.rd.autotasks.validations;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {

        String expression = "^[(a-z)]{2,}+(_)+[a-z]+([0-9]?)+@[epam.com]+$";
        CharSequence inputStr = email;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (email == null || email.isEmpty() || email.isBlank()) {
            return false;
        }
            return matcher.matches();
        }

    public static void main(String args[]) {
        String first = "william_shakespeare@epam.com";
        String second = "lu_e@epam.com";
        String third = "william_shakespeare1@epam.com";
        String fourth = "william_shakespeare2@epam.com";//true
        String fifth = "william@epam.com";
        String sixth = "william.shakespeare@epam.com";
        String seventh = "william...shakespeare@epam.com";
        String eighth = "william-shakespeare@epam.com";
        String ninth = "shakespeare123@epam.com";
        String tenth = "william_$hakespeare@epam.com";
        String eleventh = "_shakespeare@epam.com";
        String twelve = "shakespeare_@epam.com";
        String thirteenth = "william.shakespeare@epam@com";
        String fourteenth = "william.shakespeare@epamcom";
        String fifteenth = " ";
        for (String s : Arrays.asList(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelve, thirteenth, fourteenth, fifteenth)) {
            System.out.println(validateEpamEmail(s));
        }
    }
}