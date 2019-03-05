/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahdisa.state.machine.ussd;

import java.util.Scanner;
import com.fahdisa.state.machine.ussd.example.MainMenu;
import com.fahdisa.state.machine.ussd.model.Context;
import com.fahdisa.state.machine.ussd.model.Message;

/**
 *
 * @author prodigy4440
 */
public class Simulator {
    public static void main(String[] args) {
        System.out.println("Enter State Machine");
        
        Scanner scanner = new Scanner(System.in);
        
        
        Context context = new Context("2348131631151");
        context.setState(new MainMenu(context));
        Message message = null;
        
        boolean isContinue = true;
        
        do{
            message = context.process(message);
            System.out.println(message.getContent());
            if(message.getType() ==Message.Type.DISPLAY){
                isContinue = false;
            }else{
                String input = scanner.nextLine();
                System.out.println("Input: "+input);
                message = new Message(input, Message.Type.REPLY);
            }
        }while(isContinue);
        
        System.out.println("Exit State Machine");
    }
}
