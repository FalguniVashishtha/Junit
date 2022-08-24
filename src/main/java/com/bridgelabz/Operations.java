package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface validFirstName{
    boolean validateFirstName(String message) throws InvalidFirstNameException;
}
interface validLastName{
    boolean validateLastName(String message) throws InvalidLastNameException;
}
interface validEmailId {
    boolean validateEmailID(String message) throws InvalidEmailIdException;
}
interface validMobileNumber{
    boolean validateMobNumber(String message) throws InvalidMobileNumberException;
}
interface validPassword{
    boolean validatePassword(String message) throws InvalidPasswordException;
}
public class Operations {
    //Taking user input
    static Scanner sc = new Scanner(System.in);

     // This method takes First Name which starts with Capital letter and throws custom exception if not valid
        validFirstName fNameValidate = fName -> {
        if (fName == null) {
            throw new InvalidFirstNameException("Null Pointer Exception");
        } else if (fName.length() == 0) {
            throw new InvalidFirstNameException("Empty Exception ");
        }
        //regex function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fName);
        boolean result = m.matches();

        if (!m.matches()) {
            throw new InvalidFirstNameException("first Name should start with a Cap and should have minimum 3 chars");
        } else
            return true;
    };

     // This method takes Last Name which starts with Capital letter and throws custom exception if not valid
    validLastName lNameValidate = lName -> {
        if (lName == null) {
            throw new InvalidLastNameException("Null Pointer Exception");
        } else if (lName.length() == 0) {
            throw new InvalidLastNameException("Empty Exception ");
        }
        //regex function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lName);
        boolean result = m.matches();

        // if condition is to check the Last name is valid or not
        if (!m.matches()) {
            throw new InvalidLastNameException("Last Name should start with a Cap and should have minimum 3 chars");
        } else
            return true;
    };
    // taking ValidEmailId method
    validEmailId emailIDValidate = mailId -> {
        if (mailId == null) {
            throw new InvalidEmailIdException("Null Pointer Exception");
        } else if (mailId.length() == 0) {
            throw new InvalidEmailIdException("Empty Exception ");
        }
        //Expression for EmailId
        String rejex = "^[a-z]{3,}(.[-+a-z0-9]*)?@([a-z0-9]){1,}.[a-z]{2,}+(.[a-z]{2,})*";
        //Creating pattern object
        Pattern P1 = Pattern.compile(rejex);
        //Creating matcher object
        Matcher M1 = P1.matcher(mailId);
        boolean result = M1.matches();
        //Checking whether entered Mail-id is valid or not

        if (!M1.matches()) {
            throw new InvalidEmailIdException("enter a valid email");
        } else
            return true;
    };

    // This method checks if the entered number is valid or not and throws custom exception if not valid

    //regex function is used to check the Mobile number
    validMobileNumber mobNumberValidate = mobNo -> {
        if (mobNo == null) {
            throw new InvalidMobileNumberException("Null Pointer Exception");
        } else if (mobNo.length() == 0) {
            throw new InvalidMobileNumberException("Empty Exception ");
        }
        String regex = "^[0-9]{2}\\s[0-9]{10,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(mobNo);
        boolean result = m1.matches();

        // if condition is to check the Mobile number is valid or not
        if (!m1.matches()) {
            throw new InvalidMobileNumberException("Enter the Valid Mobile number with county code");
        } else
            return true;
    };

     // Method to check if the password is valid or not and throws custom exception if not valid
    validPassword passwordValidate = passwrd -> {
        if (passwrd == null) {
            throw new InvalidPasswordException("Null Pointer Exception");
        } else if (passwrd.length() == 0) {
            throw new InvalidPasswordException("Empty Exception ");
        }

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(passwrd);
        boolean result = m1.matches();

        // if condition is to check the password is valid or not
        if (!m1.matches()) {
            throw new InvalidPasswordException("Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and exactly 1 special character ");
        } else
            return true;
    };
}