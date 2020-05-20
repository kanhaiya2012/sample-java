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
public class Send 
        implements java.io.Serializable {
    private static final long serialVersionUID = -2487679101543048225L;
    private String replyTo;
    private From from;
    private String subject;
    private Long templateId;
    private List<Content> content;
    private List<Attachments> attachments;
    private List<Personalizations> personalizations;
    private Settings settings;
    private List<String> tags;
    private Boolean lintPayload;
    private Long schedule;
    private List<EmailStruct> bcc;
    /** GETTER
     * email address which recipients can reply to.
     */
    @JsonGetter("reply_to")
    public String getReplyTo ( ) { 
        return this.replyTo;
    }
    
    /** SETTER
     * email address which recipients can reply to.
     */
    @JsonSetter("reply_to")
    public void setReplyTo (String value) { 
        this.replyTo = value;
    }
 
    /** GETTER
     * email address representing the sender of the mail
     */
    @JsonGetter("from")
    public From getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * email address representing the sender of the mail
     */
    @JsonSetter("from")
    public void setFrom (From value) { 
        this.from = value;
    }
 
    /** GETTER
     * Subject line of the email
     */
    @JsonGetter("subject")
    public String getSubject ( ) { 
        return this.subject;
    }
    
    /** SETTER
     * Subject line of the email
     */
    @JsonSetter("subject")
    public void setSubject (String value) { 
        this.subject = value;
    }
 
    /** GETTER
     * ID of the template to be used for sending the mail
     */
    @JsonGetter("template_id")
    public Long getTemplateId ( ) { 
        return this.templateId;
    }
    
    /** SETTER
     * ID of the template to be used for sending the mail
     */
    @JsonSetter("template_id")
    public void setTemplateId (Long value) { 
        this.templateId = value;
    }
 
    /** GETTER
     * content in text/plain format
     */
    @JsonGetter("content")
    public List<Content> getContent ( ) { 
        return this.content;
    }
    
    /** SETTER
     * content in text/plain format
     */
    @JsonSetter("content")
    public void setContent (List<Content> value) { 
        this.content = value;
    }
 
    /** GETTER
     * attachment information
     */
    @JsonGetter("attachments")
    public List<Attachments> getAttachments ( ) { 
        return this.attachments;
    }
    
    /** SETTER
     * attachment information
     */
    @JsonSetter("attachments")
    public void setAttachments (List<Attachments> value) { 
        this.attachments = value;
    }
 
    /** GETTER
     * to recipient with some personalized data like to address, attachments and attributes
     */
    @JsonGetter("personalizations")
    public List<Personalizations> getPersonalizations ( ) { 
        return this.personalizations;
    }
    
    /** SETTER
     * to recipient with some personalized data like to address, attachments and attributes
     */
    @JsonSetter("personalizations")
    public void setPersonalizations (List<Personalizations> value) { 
        this.personalizations = value;
    }
 
    /** GETTER
     * Enable/Disable settings like click, open and unsubscribe track
     */
    @JsonGetter("settings")
    public Settings getSettings ( ) { 
        return this.settings;
    }
    
    /** SETTER
     * Enable/Disable settings like click, open and unsubscribe track
     */
    @JsonSetter("settings")
    public void setSettings (Settings value) { 
        this.settings = value;
    }
 
    /** GETTER
     * define custom tags to organize your emails
     */
    @JsonGetter("tags")
    public List<String> getTags ( ) { 
        return this.tags;
    }
    
    /** SETTER
     * define custom tags to organize your emails
     */
    @JsonSetter("tags")
    public void setTags (List<String> value) { 
        this.tags = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("lint_payload")
    public Boolean getLintPayload ( ) { 
        return this.lintPayload;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("lint_payload")
    public void setLintPayload (Boolean value) { 
        this.lintPayload = value;
    }
 
    /** GETTER
     * schedule the time of email delivery
     */
    @JsonGetter("schedule")
    public Long getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * schedule the time of email delivery
     */
    @JsonSetter("schedule")
    public void setSchedule (Long value) { 
        this.schedule = value;
    }
 
    /** GETTER
     * Global bcc can be defined here
     */
    @JsonGetter("bcc")
    public List<EmailStruct> getBcc ( ) { 
        return this.bcc;
    }
    
    /** SETTER
     * Global bcc can be defined here
     */
    @JsonSetter("bcc")
    public void setBcc (List<EmailStruct> value) { 
        this.bcc = value;
    }
 
}
