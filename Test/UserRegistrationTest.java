package com.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateFirstName("tom");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateFirstName("to");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("cruise");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("cr");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail("tom.cruise01@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail("@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePhoneNumber("91 9134435900");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePhoneNumber("9134435900");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePassword("Spqr#$%12345");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePassword("Sp1qr3434");
        Assert.assertFalse(result);
    }

}
