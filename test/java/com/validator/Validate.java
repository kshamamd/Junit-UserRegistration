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
    @Test
    void Check_Email_WhileCorrect_Return_True() {
        JunitAssertion email = new JunitAssertion();
        Boolean ch = email.email("shama@gmail.com");
        Assertions.assertTrue(ch);
        System.out.println(true);
    }
    @Test
    public void givenEmailIsValidShouldReturnTrue() {
        JunitAssertion email = new JunitAssertion();
        boolean result = email.email("abc-100@gmail.com.au"); //accepts all the sample emails
        Assertions.assertTrue(result);
    }

}