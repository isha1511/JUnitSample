package org.example;
import java.util.regex.*;

public class UserRegistration {

    private final String validName="^[A-Z][a-z]{2,}$";

   private final String validEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

   // private final String InvalidEmail =".*\\.\\..*|.*@.*@.*|^\\.|.*\\.@.*|.*\\.@|.*@\\..*|.*@[^A-Za-z0-9].*|.*[^A-Za-z0-9._%+-]+@.*|.*\\.[A-Za-z]{1}$|.*\\.[A-Za-z0-9]+\\.[A-Za-z]{1}$|.*@.*\\..*\\..*";

    private final String valid_No="^[0-9]{10}$";
    private final String valid_No_WithContryCode="^\\+[0-9]+ {1,3}[0-9]{10}$";

    private final String validPass="^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+{}\\[\\]:;<>,.?~\\\\/-]).{8,}$";

    private final Pattern patternobj1=Pattern.compile(validName);

    private final Pattern patternobj2= Pattern.compile(validEmail);
   // private final Pattern invalidPattern= Pattern.compile(InvalidEmail);

    private final Pattern patternobj3= Pattern.compile(valid_No);
    private final Pattern patternobj4= Pattern.compile(valid_No_WithContryCode);

    private final Pattern patternobj5= Pattern.compile(validPass);


    public boolean isValidName(String name){

        return patternobj1.matcher(name).matches();
    }

    public boolean isValidMobNo(String no) {

        return patternobj3.matcher(no).matches() || patternobj4.matcher(no).matches();

    }

    public boolean isValidEmail(String email) {

        return patternobj2.matcher(email).matches();

    }

    public boolean isValidPass(String pass){

        return patternobj5.matcher(pass).matches();
    }
}
