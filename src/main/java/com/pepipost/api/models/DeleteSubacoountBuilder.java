/*
 * PepipostLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.pepipost.api.models;

import java.util.*;

public class DeleteSubacoountBuilder {
    //the instance to build
    private DeleteSubacoount deleteSubacoount;

    /**
     * Default constructor to initialize the instance
     */
    public DeleteSubacoountBuilder() {
        deleteSubacoount = new DeleteSubacoount();
    }

    /**
     * The username of the subaccount
     */
    public DeleteSubacoountBuilder username(String username) {
        deleteSubacoount.setUsername(username);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeleteSubacoount build() {
        return deleteSubacoount;
    }
}