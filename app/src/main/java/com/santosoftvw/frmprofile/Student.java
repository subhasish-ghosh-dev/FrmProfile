package com.santosoftvw.frmprofile;

import java.io.Serializable;

public class Student implements Serializable {

    private  String rollNo;
    private String semester;

    public Student(String s, String s2){
        this.rollNo=s;
        this.semester = s2;
    }


    public String toString(){
        StringBuffer strb = new StringBuffer();
        strb.append("rollNo"+"  "+semester);
        return strb.toString();
    }


}
