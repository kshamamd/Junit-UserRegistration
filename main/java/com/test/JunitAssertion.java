package com.test;

import java.util.regex.Pattern;

public class JunitAssertion {
    public Boolean firstName(String a) {
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",a);
        return firstNameValidation;
    }

    public Boolean lastName(String b) {
        Boolean lastNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",b);
        return lastNameValidation;
    }

    public Boolean email(String b) {
        Boolean emailValidation = Pattern.matches("^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,6}",b);
        //Boolean emailValidation = Pattern.matches("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$",b);
        return emailValidation;

    }
}
