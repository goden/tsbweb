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
public class MessageInjection1 implements Message {

    @Override
    public String get() {
        return "A message from MessageInjection1. An exception will be thrown.";
    }
    
}
