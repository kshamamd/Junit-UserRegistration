package com.validator;

import com.test.JunitAssertion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.SQLOutput;

public class Validate {
    @Test
    void Check_Firstname_WhileCorrect_Return_True() {
        JunitAssertion fName = new JunitAssertion();
        String ch = fName.firstName("Kshama");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

    @Test
    void Check_Lastname_WhileCorrect_Return_True() {

        JunitAssertion lName = new JunitAssertion();
        String ch = lName.lastName("Deshmukh");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

    @Test
    void Check_Email_WhileCorrect_Return_True() {

        JunitAssertion email = new JunitAssertion();
        String ch = email.email("kshama@gmail.com");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }
    @Test
    void Check_Number_WhileCorrect_Return_True() {

        JunitAssertion number = new JunitAssertion();
        String ch = number.number("91 1234567890");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }
    @Test
    void Check_Password_WhileCorrect_Return_True() {
        JunitAssertion password = new JunitAssertion();
        String ch = password.password("Kshama@123");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }
}