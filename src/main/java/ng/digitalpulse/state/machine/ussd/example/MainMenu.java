/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.digitalpulse.state.machine.ussd.example;

import java.io.Serializable;
import java.util.Objects;
import ng.digitalpulse.state.machine.ussd.model.Context;
import ng.digitalpulse.state.machine.ussd.model.Message;
import ng.digitalpulse.state.machine.ussd.state.AbstractState;

/**
 *
 * @author prodigy4440
 */
public class MainMenu extends AbstractState implements Serializable {

    private String mainMenu = "Welcome to Jamb Digital Service, "
            + "Reply \n1. Admission Status \n2. Result Checking\n3. Help";
    private String mainMenuStripped = "Reply \n1. Admission Status \n2. Result Checking\n3. Help";

    public MainMenu(Context context) {
        super("Main", 1, context);
    }

    @Override
    public Message handle(Message message) {
        if (Objects.isNull(message)) {
            return new Message(mainMenu, Message.Type.REPLY);
        } else {
            String content = message.getContent();
            try {
                int option = Integer.parseInt(content);
                switch (option) {
                    case 1:
                        Admission admission = new Admission(getContext());
                        return admission.handle(null);
                    case 2:
                        Result result = new Result(getContext());
                        return result.handle(null);
                    case 3:
                        Help help = new Help(getContext());
                        return help.handle(null);
                    default:
                        return new Message("Invalid Option, " + mainMenuStripped, Message.Type.REPLY);
                }
            } catch (NumberFormatException nfe) {
                return new Message("Invalid Option, " + mainMenuStripped, Message.Type.REPLY);
            }

        }

    }

    @Override
    public Integer getCode() {
        return this.getCode();
    }

}
