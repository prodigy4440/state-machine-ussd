/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.digitalpulse.state.machine.ussd.model;

import java.io.Serializable;
import java.util.Objects;
import ng.digitalpulse.state.machine.ussd.state.State;

/**
 *
 * @author prodigy4440
 */
public class Context implements Serializable{

    private static final long serialVersionUID = 1795882041711730940L;
 
    private String phoneNumber;
    private State state;

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
    
}
