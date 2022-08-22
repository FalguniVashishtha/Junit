package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Operations {
    // taking ValidFirstName method
    public static boolean validFirstName(String fName) throws InvalidFirstNameException
    {
        //regex function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fName);
        boolean result = m.matches();
        // if condition is to check the first name is valid or not
        if (!m.matches()){
            throw new InvalidFirstNameException ("first Name should start with a Cap and should have minimum 3 chars");
        }
        else
            return true;
    }
    public static boolean validLastName(String lName) throws InvalidLastNameException {
        //regix function is used to check the last name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lName);
        boolean result = m.matches();

        // if condition is to check the Last name is valid or not
        if (!m.matches()){
            throw new InvalidLastNameException("Last Name should start with a Cap and should have minimum 3 chars");
        }else
            return true;
    }
    // taking ValidEmailId method
    public static boolean validEmailId(String mailId) throws InvalidEmailIdException{
        //Expression for EmailId
        String rejex="^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}";
        //Creating pattern object
        Pattern P=Pattern.compile(rejex);
        //Creating matcher object
        Matcher M=P.matcher(mailId);
        boolean result=M.matches();
        //Checking whether entered Mail-id is valid or not
        if(!M.matches()){
            throw new InvalidEmailIdException("enter a valid email address. ");
        }else
            return true;
    }
    public static boolean validMobileNumber(String mobNo) throws InvalidMobileNumberException{

        //regex function is used to check the Mobile number
        String regex = "^[0-9]{2}\\s[0-9]{10,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(mobNo);
        boolean result = m1.matches();

        // if condition is to check the Mobile number is valid or not
        if (!m1.matches()){
            throw new InvalidMobileNumberException("Enter the Valid Mobile number with county code");
        }else
            return true;
    }
    public static boolean validPassword(String passwrd) throws InvalidPasswordException{

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(passwrd);
        boolean result = m1.matches();
        // if condition is to check the password is valid or not
        if (!m1.matches()){
            throw new InvalidPasswordException("Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and 1 special character ");
        }else
            return true;
    }
}
