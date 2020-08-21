/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taishin.model;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author goden
 */
@RequestScoped
public class MessageAlternativeImp2 implements MessageAlternative {

    @Override
    public String get() {
        return "The message from MessageAlternativeImp2";
    }
    
}
