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
public class Result extends AbstractState {

    public Result(Context context) {
        super("RESULT", 3, context);
    }

    @Override
    public Message handle(Message message) {
        return new Message("Dear XYZ find your result below, \n"
                + "Math: 45, Phy: 63, Che: 70, Eng: 71", Message.Type.DISPLAY);
    }

}
