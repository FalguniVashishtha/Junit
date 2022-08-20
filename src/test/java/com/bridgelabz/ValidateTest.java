package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateTest {
    Operations operations = new Operations();
    //Happy test case for first name
    @Test
    public void firstNameHappy() {
        boolean result = operations.validFirstName("Abc");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for First name
    @Test
    public void firstNameSad() {
        boolean result = operations.validFirstName("abc");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    //Happy True test case for Last name
    @Test
    public void lastNameHappy() {
        boolean result = operations.validLastName("Xyz");
        System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Last name
    @Test
    public void lastnamesad() {
        boolean result = operations.validLastName("hdbj");
        System.out.println(result);
        Assertions.assertFalse(result);
    }
    // Happy test case for Email Address
    @Test
    public void emailHappy() {
        boolean result = operations.validEmailAddress("abc112@gmail.com");
        //System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Email Address
    @Test
    public void emailSad() {
        boolean result = operations.validEmailAddress("dgg46ex^%$@.gmail.com");
        //System.out.println(result);
        Assertions.assertFalse(result);
    }
    // Happy test case for Mobile number
    @Test
    public void mobileNumberHappy() {
        boolean result = operations.validMobileNumber("91 1234567890");
        //System.out.println(result);
        Assertions.assertTrue(result);
    }
    //Sad test case for Mobile Number
    @Test
    public void mobileNumberSad() {
        boolean result = operations.validMobileNumber("91 5326");
        //System.out.println(result);
        Assertions.assertFalse(result);
    }
    // Happy test case for Password
    @Test
    public void validatePassword1() {
        boolean result = operations.validPassword("gxnsz43465Af%&");
        //System.out.println(result);
        Assertions.assertTrue(result);
    }
}
