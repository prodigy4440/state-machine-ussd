/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahdisa.state.machine.ussd.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import com.fahdisa.state.machine.ussd.state.State;

/**
 *
 * @author prodigy4440
 */
public class Context implements Serializable{

    private static final long serialVersionUID = 1795882041711730940L;
 
    private String phoneNumber;
    private State state;

    private Map<String, Object> meta = new LinkedHashMap<>();

    public Context() {
    }

    public Context(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Message process(Message message){
            return (Objects.isNull(this.state))? new Message("Invalid state", 
                    Message.Type.DISPLAY):this.state.handle(message);
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public void setState(State state){
        this.state = state;
    }

    public Map<String, Object> getMeta() {
        return meta;
    }

    public void setMeta(Map<String, Object> meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Context context = (Context) o;
        return Objects.equals(phoneNumber, context.phoneNumber) &&
                Objects.equals(state, context.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, state);
    }

    @Override
    public String toString() {
        return "Context{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", state=" + state +
                ", meta=" + meta +
                '}';
    }
}
