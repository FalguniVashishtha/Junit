package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Operations {
    // taking ValidFirstName method
    public static boolean validFirstName(String fName) {

        //regix function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fName);
        boolean result = m.matches();
        return result;
    }
    // taking ValidLastName method
    public static boolean validLastName(String lName) {

        //regix function is used to check the first name
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lName);
        boolean result = m.matches();
        return result;
    }
    // taking ValidEmailId method
    public static boolean validEmailAddress(String emailAddress){

        //Expression for EmailId
        String rejex="^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        //Creating pattern object
        Pattern P1 = Pattern.compile(rejex);
        //System.out.println("email");
        //Creating matcher object
        Matcher M1 = P1.matcher(emailAddress);
        boolean result = M1.matches();
        //Checking whether entered Mail-id is valid or not
        if(result)
            System.out.println("Entered EmailId is Valid");
        else
            System.out.println("Entered EmailId is Invalid");
        return result;
    }
    // Taking validMobileNumber Method
    public static boolean validMobileNumber(String mobNo){
        //regix function is used to check the Mobile number
        String regex = "^[0-9]{2}\\s{0,1}[0-9]{10,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(mobNo);
        boolean result = m1.matches();
        return result;
    }
    // taking ValidPassword method
    public static boolean validPassword(String passwrd){

        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(passwrd);
        boolean result = m1.matches();
        return result;
    }
}
