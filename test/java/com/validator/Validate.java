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
        Boolean ch = email.email("Kshama@gmail.com");
        Assertions.assertTrue(ch);
    }

    @Test
    void Check_Number_WhileCorrect_Return_True() {

        JunitAssertion number = new JunitAssertion();
        Boolean ch = number.number("91 1234567890");
        Assertions.assertTrue(ch);
    }

    @Test
    void Check_Pass1_WhileCorrect_Return_True() {
        JunitAssertion password = new JunitAssertion();
        Boolean ch = password.password("Kshamamd8");
        Assertions.assertTrue(ch);
    }

    @Test
    void Check_Pass2_WhileCorrect_Return_True() {
        JunitAssertion password = new JunitAssertion();
        Boolean ch = password.password("Kshamamd8");
        Assertions.assertTrue(ch);
    }
}