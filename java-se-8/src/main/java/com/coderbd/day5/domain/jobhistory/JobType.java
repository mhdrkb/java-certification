/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day5.domain.jobhistory;

/**
 *
 * @author Instructor
 */
public class JobType {
    
    //step-2 field declaration
    private int id;
    private String name;
//step-3 default constructor

    public JobType() {
    }

    //step-4 Argumentative constructor
    public JobType(int id, String name) {
        this.id = id;
        this.name = name;
    }
//step-5 getter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
