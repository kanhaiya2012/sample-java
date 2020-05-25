/*
 * PepipostLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.pepipost.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class DeleteDomain 
        implements java.io.Serializable {
    private static final long serialVersionUID = 114752425631407702L;
    private String domain;
    /** GETTER
     * Name of the domain
     */
    @JsonGetter("domain")
    public String getDomain ( ) { 
        return this.domain;
    }
    
    /** SETTER
     * Name of the domain
     */
    @JsonSetter("domain")
    public void setDomain (String value) { 
        this.domain = value;
    }
 
}