package com.santosoftvw.frmprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    HashMap<String, ArrayList<String>> info = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fullName = (EditText) findViewById(R.id.editTextFullName);
        EditText street = (EditText) findViewById(R.id.editTextStreet);
        EditText city = (EditText) findViewById(R.id.editTextCity);
        EditText email = (EditText) findViewById(R.id.editTextEmailAddress);
        EditText mobile = (EditText) findViewById(R.id.editTextMobile);

        Button save = (Button) findViewById(R.id.button);
        Button send = (Button) findViewById(R.id.button2);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast msg = Toast.makeText(getApplicationContext(), "Name: "+fullName.getText()+"Street: "+street.getText(),Toast.LENGTH_LONG);
                msg.setMargin(50,50);
                msg.show();*/
                ArrayList<String> details = new ArrayList<>();
                details.add(fullName.getText().toString());
                details.add(street.getText().toString());
                details.add(city.getText().toString());
                details.add(email.getText().toString());
                details.add(mobile.getText().toString());

                info.put(mobile.getText().toString(), details);


                /*HashMap<Integer, Student> students = new HashMap<>();
                students.put(1,new Student("203421", "3rdA"));
                students.put(2,new Student("203422", "3rdB"));
                students.put(3,new Student("203423", "3rdC"));
                students.put(4,new Student("203424", "3rdD"));

                for(Map.Entry e : students.entrySet()){
                    Log.d("DEBUG FROM STUDENT",e.getKey()+"   "+e.getValue());
                }
*/

            }
        });

        send.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ViewProfile.class);
                intent.putExtra("profile", info);
                startActivity(intent);
            }
        });




    }
}