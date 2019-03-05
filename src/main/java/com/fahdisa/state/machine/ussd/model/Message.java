/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahdisa.state.machine.ussd.model;

import java.io.Serializable;

/**
 *
 * @author prodigy4440
 */
public class Message implements Serializable{
    
    private String content;
    
    private Type type;

    public Message() {
    }

    public Message(String content, Type type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    public enum Type{
        REPLY,DISPLAY,INPUT;
    }
}
