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
        return emailValidation;
    }

    public Boolean number(String b) {
        Boolean numberValidation = Pattern.matches("^[91]+[\\s]+[0-9]{10}",b);
        return numberValidation;
    }
}
