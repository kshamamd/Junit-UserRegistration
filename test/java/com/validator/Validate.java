package com.validator;

import com.test.JunitAssertion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.SQLOutput;

public class Validate {
    @Test
    void Check_Firstname_WhileCorrect_Return_True() {

        JunitAssertion fName = new JunitAssertion();
        Boolean ch = fName.firstName("Kshama");
        Assertions.assertTrue(ch);
    }

    @Test
    void Check_Lastname_WhileCorrect_Return_True() {
        JunitAssertion lName = new JunitAssertion();
        Boolean ch = lName.lastName("Deshmukh");
        Assertions.assertEquals(true, ch);
        System.out.println(ch);



    }

}

  /*  public void firstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if(result == true)
            System.out.println("First Name is Valid...");
        else
            System.out.println("First Name is not valid...");
    }*/