/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahdisa.state.machine.ussd.example;

import com.fahdisa.state.machine.ussd.model.Context;
import com.fahdisa.state.machine.ussd.model.Message;
import com.fahdisa.state.machine.ussd.state.AbstractState;

/**
 *
 * @author prodigy4440
 */
public class Help extends AbstractState{

    private String helpMenu = "Jamb Menu\n1. Admission Status \n2. Result Checking\n3. Help";
    
    public Help(Context context){
        super("HELP",4, context);
    }
    
    @Override
    public Message handle(Message message) {
        return new Message(helpMenu, Message.Type.REPLY);
    }
    
}
