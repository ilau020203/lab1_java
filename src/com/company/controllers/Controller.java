package com.company.controllers;

import com.company.models.Model;
import com.company.views.View;
/**
 * @author ilau020203
 * @version 0.0.1
 */

public class Controller {
    Model model;

    /**
     * Create controller
     */
    public Controller(){
        model= new Model(10);
    }

    /**
     * Start controller
     */
    public void start(){
        model.setStrings(View.get10Strings());
        model.sort();
        View.printStrings(model.getStrings());
    }
}
