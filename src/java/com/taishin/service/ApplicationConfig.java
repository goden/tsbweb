/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taishin.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author goden
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.taishin.service.CustomerFacadeREST.class);
        resources.add(com.taishin.service.DiscountCodeFacadeREST.class);
        resources.add(com.taishin.service.ManufacturerFacadeREST.class);
        resources.add(com.taishin.service.MicroMarketFacadeREST.class);
        resources.add(com.taishin.service.PersonFacadeREST.class);
        resources.add(com.taishin.service.ProductCodeFacadeREST.class);
        resources.add(com.taishin.service.ProductFacadeREST.class);
        resources.add(com.taishin.service.PurchaseOrderFacadeREST.class);
    }
    
}
