package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_PATTERN =
            "^[(a-z)]{2,}+(_)+[a-z]{1,}+([0-9]{0,1})+@[epam.com]+$";

    public EpamEmailValidation() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public static boolean validateEpamEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

//    public static void main(String args[]) {
//        EpamEmailValidation validations = new EpamEmailValidation();
//        String first = "william_shakespeare@epam.com";
//        String second = "lu_e@epam.com";
//        String third = "william_shakespeare1@epam.com";
//        String fourth = "william_shakespeare2@epam.com";//true
//        String fifth = "william@epam.com";
//        String sixth = "william.shakespeare@epam.com";
//        String seventh = "william...shakespeare@epam.com";
//        String eighth = "william-shakespeare@epam.com";
//        String ninth = "shakespeare123@epam.com";
//        String tenth = "william_$hakespeare@epam.com";
//        String eleventh = "_shakespeare@epam.com";
//        String twelve = "shakespeare_@epam.com";
//        String thirteenth = "william.shakespeare@epam@com";
//        String fourteenth = "william.shakespeare@epamcom";
//        String fifteenth = " ";
//        System.out.println(validations.validateEpamEmail(first));
//        System.out.println(validations.validateEpamEmail(second));
//        System.out.println(validations.validateEpamEmail(third));
//        System.out.println(validations.validateEpamEmail(fourth));
//        System.out.println(validations.validateEpamEmail(fifth));
//        System.out.println(validations.validateEpamEmail(sixth));
//        System.out.println(validations.validateEpamEmail(seventh));
//        System.out.println(validations.validateEpamEmail(eighth));
//        System.out.println(validations.validateEpamEmail(ninth));
//        System.out.println(validations.validateEpamEmail(tenth));
//        System.out.println(validations.validateEpamEmail(eleventh));
//        System.out.println(validations.validateEpamEmail(twelve));
//        System.out.println(validations.validateEpamEmail(thirteenth));
//        System.out.println(validations.validateEpamEmail(fourteenth));
//        System.out.println(fifteenth);
//    }
}







