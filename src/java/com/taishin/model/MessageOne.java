/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taishin.model;

/**
 *
 * @author goden
 */
public class MessageOne implements Message {
    
    public MessageOne() {
        System.out.println("MessageOne created.");
    }
    

    @Override
    public String get() {
        return "A message from MessageOne. An example using message without CDI.";
    }
    
}
