/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taishin.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author goden
 */
@Named("One")
@RequestScoped
public class MessageNamedQualifierImp implements MessageNamedQualifier {

    @Override
    public String qualify() {
        return "The message from MessageNamedQualifierImp.";
    }
    
}
