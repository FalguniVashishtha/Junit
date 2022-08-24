package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateTest {
    //Creating object for operation class in main method
    Operations operations = new Operations();
    //test case for first name
    @Test
    public void firstNameTrue() {
        try {
            Assertions.assertTrue(operations.fNameValidate.validateFirstName("Abcd"));
            System.out.println("First Name is valid");
        }catch (InvalidFirstNameException e){
            System.out.println("Invalid First Name " + e);
        }
    }
    @Test
    public void lastNameTrue() {
        try {
            Assertions.assertTrue(operations.lNameValidate.validateLastName("Lmn"));
            System.out.println("Last Name is valid");
        }catch (InvalidLastNameException e){
            System.out.println("Invalid last name " + e);
        }
    }
    @Test
    public void emailTrue() {
        try {
            Assertions.assertTrue(operations.emailIDValidate.validateEmailID("abc112@gmail.com"));
            System.out.println("Email Id is valid ");
        }catch (InvalidEmailIdException e){
            System.out.println("Invalid Email ID " + e);
        }
    }
    @Test
    public void mobileNumberTrue() {
        try {
            Assertions.assertTrue(operations.mobNumberValidate.validateMobNumber("91 1234567890"));
            System.out.println("Mobile number is valid ");
        }catch (InvalidMobileNumberException e){
            System.out.println("Invalid Mobile Number" + e);
        }
    }
    @Test
    public void passwordTrue()  {
        try {
            Assertions.assertTrue(operations.passwordValidate.validatePassword("Gfv$%$2dcfg"));
            System.out.println("Password is valid");
        }catch (InvalidPasswordException e){
            System.out.println("Invalid Password " + e);
        }
    }
}
