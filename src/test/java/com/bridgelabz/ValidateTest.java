package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateTest {
    Operations operations = new Operations();
    // test case for first name
    @Test
    public void firstNameTrue() {
        try {
            Assertions.assertTrue(Operations.validFirstName("Abc"));
            System.out.println("Valid First Name.");
        }catch (InvalidFirstNameException e){
            System.out.println("Invalid First Name: " + e);
        }
    }
    //test case for Last name
    @Test
    public void lastNameTrue() {
        try {
            Assertions.assertTrue(Operations.validLastName("Xyz"));
            System.out.println("Valid Last name");
        }catch (InvalidLastNameException e){
            System.out.println("Invalid Last Name: " + e);
        }
    }
    //test case for Email Id
    @Test
    public void emailTrue() {
        try {
            Assertions.assertTrue(Operations.validEmailId("zbc112@gmail.com"));
            System.out.println("Valid Email Address.");
        }catch (InvalidEmailIdException e){
            System.out.println("Invalid Email ID: " + e);
        }
    }
    // test case for Mobile number
    @Test
    public void mobileNumberTrue() {
        try {
            Assertions.assertTrue(Operations.validMobileNumber("91 1234567890"));
            System.out.println("Valid mobile Number.");
        }catch (InvalidMobileNumberException e){
            System.out.println("Invalid Mobile Number: " + e);
        }
    }
    // test case for Password
    @Test
    public void passwordTrue()  {
        try {
            Assertions.assertTrue(Operations.validPassword("Afhx@$1jhbvb"));
            System.out.println("Valid Password.");
        }catch (InvalidPasswordException e){
            System.out.println("Invalid Password: " + e);
        }
    }
}
