package com.test;

import java.util.regex.Pattern;

public class JunitAssertion {
    public String firstName(String a) {
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",a);
        if(firstNameValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }
    public String lastName(String a) {
        Boolean lastNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",a);
        if(lastNameValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }
    public String email(String a) {
        Boolean emailValidation = Pattern.matches("^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,6}",a);
        if(emailValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }
    public String number(String a) {
        Boolean numberValidation = Pattern.matches("^[91]+[\\s]+[0-9]{10}",a);
        if(numberValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }
    public String password(String a) {
        Boolean passwordValidation = Pattern.matches("[A-Za-z0-9]*[^A-Za-z0-9]{1}[A-Za-z0-9]*",a);
        if(passwordValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }

    /*public Boolean firstName(String a) {
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
*/
}
