package pl.sdacademy.unit.test.basic.exercises.tdd.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    private static final Pattern VALID_EMAIL_ADDRESS_PATTERN = Pattern.compile("^[a-zA-Z0-9-_.]+@[a-zA-Z0-9-_.]+");

    public static boolean validate(String emailStr) {
        return emailStr == null ? false : VALID_EMAIL_ADDRESS_PATTERN.matcher(emailStr).matches();
    }
}