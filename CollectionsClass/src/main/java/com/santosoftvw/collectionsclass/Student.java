/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosoftvw.collectionsclass;

import java.util.Comparator;

/**
 *
 * @author subhasish
 */
public class Student implements Comparable<Student>, Comparator<Student>{

    private int rollNo;
    private String name;
    private Character symbol;
    
    
    public Student(Integer roll, String name ){
        this.rollNo = roll;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public int compareTo(Student o) {
        //if(o instanceof String)
        //return this.rollNo.compareTo(o.rollNo);
        return this.name.compareTo(o.getName());
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
    
}
