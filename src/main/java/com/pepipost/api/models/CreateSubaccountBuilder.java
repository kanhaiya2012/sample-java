/*
 * PepipostLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.pepipost.api.models;

import java.util.*;

public class CreateSubaccountBuilder {
    //the instance to build
    private CreateSubaccount createSubaccount;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSubaccountBuilder() {
        createSubaccount = new CreateSubaccount();
    }

    /**
     * provide a username for the subaccount
     */
    public CreateSubaccountBuilder username(String username) {
        createSubaccount.setUsername(username);
        return this;
    }

    /**
     * email address to be registered with the account.
     */
    public CreateSubaccountBuilder email(String email) {
        createSubaccount.setEmail(email);
        return this;
    }

    /**
     * You can opt to set the password for the subaccount.\nIf set as 1, please provide a value in password parameter.\nIf set as 0, the email confirmation link will act as a password reset link.
     */
    public CreateSubaccountBuilder setpassword(String setpassword) {
        createSubaccount.setSetpassword(setpassword);
        return this;
    }

    /**
     * It is required to pass this value, if setpassword is set as 1.\nThe password must comprise minimum of 8 characters and include one uppercase character, one lowercase character, one numeric character.
     */
    public CreateSubaccountBuilder password(String password) {
        createSubaccount.setPassword(password);
        return this;
    }

    /**
     * Allowed values one_time_credit or unlimited by default, all subaccounts are created with credit type as unlimited.
     */
    public CreateSubaccountBuilder creditType(String creditType) {
        createSubaccount.setCreditType(creditType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSubaccount build() {
        return createSubaccount;
    }
}