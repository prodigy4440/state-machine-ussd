/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.digitalpulse.state.machine.ussd.example;

import ng.digitalpulse.state.machine.ussd.model.Context;
import ng.digitalpulse.state.machine.ussd.model.Message;
import ng.digitalpulse.state.machine.ussd.state.AbstractState;

/**
 *
 * @author prodigy4440
 */
public class Admission extends AbstractState {

    public Admission(Context context){
        super("ADMISSION", 2, context);
    }
    
    @Override
    public Message handle(Message message) {
        String phoneNumber = getContext().getPhoneNumber();
        return new Message("Congratulations "+phoneNumber+", "
                + "you have been given admission to XYZ University.", Message.Type.DISPLAY);
    }
    
}
