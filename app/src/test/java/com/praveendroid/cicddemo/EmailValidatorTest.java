package com.praveendroid.cicddemo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.praveendroid.cicddemo.utils.EmailValidator;

import org.junit.Test;

/**
 * Unit test cases for validating the EmailValidator methods logic
 */
public class EmailValidatorTest {

    @Test
    public void emailValidator_CorrectEmail_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@gmail.com"));
    }


    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.in"));
    }

    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"));
    }

    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"));
    }

    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"));
    }

    @Test
    public void emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""));
    }

    @Test
    public void emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null));
    }
}
