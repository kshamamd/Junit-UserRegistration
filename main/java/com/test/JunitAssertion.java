package com.test;

import java.util.regex.Pattern;

public class JunitAssertion {
    public Boolean firstName(String a) {
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",a);
        return firstNameValidation;
    }
}
