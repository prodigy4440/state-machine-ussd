/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahdisa.state.machine.ussd.state;

import java.io.Serializable;
import com.fahdisa.state.machine.ussd.model.Context;
import com.fahdisa.state.machine.ussd.state.State;

/**
 *
 * @author prodigy4440
 */
public abstract class AbstractState implements State, Serializable {

    private static final long serialVersionUID = 1693013084145720273L;

    private final String name;
    private final Integer code;
    
    private Context context;

    public AbstractState(String name, Integer code, Context context) {
        this.name = name;
        this.code = code;
        this.context = context;
    }

    @Override
    public Context getContext() {
        return this.context;
    }

    @Override
    public void setContext(Context context) {

        this.context = context;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Integer getCode() {
        return this.code;
    }

}
