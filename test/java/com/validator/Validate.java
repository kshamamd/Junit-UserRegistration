package com.validator;

import com.test.JunitAssertion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Validate {
    @Test
    void Check_Firstname_WhileCorrect_Return_True() {

        JunitAssertion fName = new JunitAssertion();
        Boolean ch = fName.firstName("Kshama");
        Assertions.assertTrue(ch);
    }

}
