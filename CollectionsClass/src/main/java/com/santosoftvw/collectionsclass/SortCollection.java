/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosoftvw.collectionsclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
/**
 *
 * @author subhasish
 */
public class SortCollection {
    
    public static void main(String[] args) {
        Student st1 = new Student(1001, "rahim");
        Student st2 = new Student(1006, "ayan");
        Student st3 = new Student(1008, "bikram");
        Student st4 = new Student(1002, "karim");
        Student st5 = new Student(1004, "mustafa");
        Student st6 = new Student(1007, "jony");
        Student st7 = new Student(1003, "jack");
        
        List<Student> lists = new LinkedList<Student>();
        Collections.addAll(lists, st1,st2,st3,st4,st5,st6,st7);
        
        lists.forEach(t -> System.out.println(t.getName()));      
        
        /*
        for(Student st: lists){
            System.out.println(st.getName());
        }*/
       /*  System.out.println("Sort By STream");
        lists.stream()
                .sorted()
                .forEach(st -> System.out.println(st.getName()));
         System.out.println("Search By STream"+st4.getName());
         System.out.println();
        lists.stream()
                .filter(Predicate.isEqual(st4))
                .forEach(st -> System.out.println(st.getName()));
        */
        System.out.println();        
        Collections.sort(lists);        
        lists.forEach(st -> System.out.println(st.getName()));
        System.out.println();
        //Collections.sort(lists, Collections.reverseOrder());
        //lists.forEach(st -> System.out.println(st.getName()));
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            while((line=reader.readLine())!=null){
                String[] str = line.split(",");
                Student st12 = new Student(Integer.valueOf(str[0]),str[1]);
                System.out.println(Collections.binarySearch(lists, st12));
                if(Collections.binarySearch(lists, st12)>= 0){
                    System.out.println("FOUND at: "+Collections.binarySearch(lists, st12));
                }
                else{
                    System.out.println("NOT FOUND"+st12.getName());
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
}
