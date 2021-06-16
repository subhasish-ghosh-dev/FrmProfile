package com.santosoftvw.frmattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);

        //HashSet<String> fruits = new HashSet<String>();
        TreeSet<String> fruits = new TreeSet<String>();
        //ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango\n");
        fruits.add("Apple\n");
        fruits.add("Orange\n");
        fruits.add("Orange\n");
        fruits.add("Mango\n");
        fruits.add("JackFruit\n");
        fruits.add("Lichi\n");
        fruits.add("BlackBerry\n");

        EditText txtFruits = (EditText)findViewById(R.id.editTextFruits);
        StringBuffer sbf = new StringBuffer();

        Iterator<String> itr = fruits.iterator();
        while(itr.hasNext()){
            sbf.append(itr.next()+"\n");

        }
        txtFruits.setText(sbf);

        Object[] obj = (Object[])fruits.toArray();
        String[] str = new String[obj.length];
        int i =0;
        for(Object o : obj){
            str[i++] = (String) o;
        }
        List<String> list = Arrays.asList(str);
        //Collections.sort(list);
        //Collections.sort(list, Collections.reverseOrder());

        EditText txtSFruits = (EditText)findViewById(R.id.editTextSortedFruits);
        StringBuffer sbf2 = new StringBuffer();
        itr = list.iterator();
        while(itr.hasNext()){
            sbf2.append(itr.next()+"\n");

        }
        txtSFruits.setText(sbf2);
    }
}