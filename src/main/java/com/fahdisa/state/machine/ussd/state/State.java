/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahdisa.state.machine.ussd.state;

import com.fahdisa.state.machine.ussd.model.Context;
import com.fahdisa.state.machine.ussd.model.Message;


/**
 *
 * @author prodigy4440
 */
public interface State {
    
    
    public Context getContext();
    
    public void setContext(Context context);
    
    public Message handle(Message message);
    
    public String getName();
    
    public Integer getCode();
    
}
