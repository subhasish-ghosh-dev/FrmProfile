<<<<<<< HEAD
package com.santosoftvw.frmprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ViewProfile extends AppCompatActivity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
/*
        TextView txtView1 = (TextView) findViewById(R.id.textView);
        TextView txtView2 = (TextView) findViewById(R.id.textView2);
        TextView txtView3 = (TextView) findViewById(R.id.textView3);
        TextView txtView4 = (TextView) findViewById(R.id.textView4);
        TextView txtView5 = (TextView) findViewById(R.id.textView6);
*/
        //ConstraintLayout root = (ConstraintLayout)findViewById(R.id.root_layout);
        LinearLayout linear_root = (LinearLayout)findViewById(R.id.linear_layout);

        Intent intent = getIntent();
        HashMap<String, String> info = (HashMap<String, String>) intent.getSerializableExtra("profile");


        for(Map.Entry e : info.entrySet()){

            ArrayList<String> details = (ArrayList<String>) e.getValue();

            TextView txtView1 = new TextView(this);
            TextView txtView2 = new TextView(this);
            TextView txtView3 = new TextView(this);
            TextView txtView4 = new TextView(this);
            TextView txtView5 = new TextView(this);

            LinearLayout lLayout = new LinearLayout(this);
            lLayout.setOrientation(LinearLayout.VERTICAL);
            lLayout.setPadding(5,15,5,15);
            lLayout.setScrollContainer(true);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    350,
                    99
            );
            /*android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="#9C27B0"
            android:text="text1"
            android:textColor="#FFFFFF"
            android:textStyle="bold"
*/
            txtView1.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView1.setBackgroundColor(Color.BLUE);
            txtView1.setTextColor(Color.WHITE);
            txtView1.setTypeface(null, Typeface.BOLD);
            txtView2.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView2.setBackgroundColor(Color.WHITE);
            txtView2.setTextColor(Color.BLUE);
            txtView2.setTypeface(null, Typeface.BOLD);
            txtView3.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView3.setBackgroundColor(Color.BLUE);
            txtView3.setTextColor(Color.WHITE);
            txtView3.setTypeface(null, Typeface.BOLD);
            txtView4.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView4.setBackgroundColor(Color.WHITE);
            txtView4.setTextColor(Color.BLUE);
            txtView4.setTypeface(null, Typeface.BOLD);
            txtView5.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView5.setBackgroundColor(Color.BLUE);
            txtView5.setTextColor(Color.WHITE);
            txtView5.setTypeface(null, Typeface.BOLD);

            txtView1.setText("Name:       "+details.get(0));
            txtView2.setText("Street:     "+details.get(1));
            txtView3.setText("City:       "+details.get(2));
            txtView4.setText("Email:      "+details.get(3));
            txtView5.setText("Mobile:     "+details.get(4));

            lLayout.addView(txtView1);
            lLayout.addView(txtView2);
            lLayout.addView(txtView3);
            lLayout.addView(txtView4);
            lLayout.addView(txtView5);

            linear_root.addView(lLayout);


        }
        Button btn = (Button) findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ChartActivity.class);
                startActivity(intent);
            }
        });

    }
=======
package com.santosoftvw.frmprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ViewProfile extends AppCompatActivity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
/*
        TextView txtView1 = (TextView) findViewById(R.id.textView);
        TextView txtView2 = (TextView) findViewById(R.id.textView2);
        TextView txtView3 = (TextView) findViewById(R.id.textView3);
        TextView txtView4 = (TextView) findViewById(R.id.textView4);
        TextView txtView5 = (TextView) findViewById(R.id.textView6);
*/
        //ConstraintLayout root = (ConstraintLayout)findViewById(R.id.root_layout);
        LinearLayout linear_root = (LinearLayout)findViewById(R.id.linear_layout);

        Intent intent = getIntent();
        HashMap<String, String> info = (HashMap<String, String>) intent.getSerializableExtra("profile");


        for(Map.Entry e : info.entrySet()){

            ArrayList<String> details = (ArrayList<String>) e.getValue();

            TextView txtView1 = new TextView(this);
            TextView txtView2 = new TextView(this);
            TextView txtView3 = new TextView(this);
            TextView txtView4 = new TextView(this);
            TextView txtView5 = new TextView(this);

            LinearLayout lLayout = new LinearLayout(this);
            lLayout.setOrientation(LinearLayout.VERTICAL);
            lLayout.setPadding(5,15,5,15);
            lLayout.setScrollContainer(true);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    350,
                    99
            );
            /*android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="#9C27B0"
            android:text="text1"
            android:textColor="#FFFFFF"
            android:textStyle="bold"
*/
            txtView1.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView1.setBackgroundColor(Color.BLUE);
            txtView1.setTextColor(Color.WHITE);
            txtView1.setTypeface(null, Typeface.BOLD);
            txtView2.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView2.setBackgroundColor(Color.WHITE);
            txtView2.setTextColor(Color.BLUE);
            txtView2.setTypeface(null, Typeface.BOLD);
            txtView3.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView3.setBackgroundColor(Color.BLUE);
            txtView3.setTextColor(Color.WHITE);
            txtView3.setTypeface(null, Typeface.BOLD);
            txtView4.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView4.setBackgroundColor(Color.WHITE);
            txtView4.setTextColor(Color.BLUE);
            txtView4.setTypeface(null, Typeface.BOLD);
            txtView5.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            txtView5.setBackgroundColor(Color.BLUE);
            txtView5.setTextColor(Color.WHITE);
            txtView5.setTypeface(null, Typeface.BOLD);

            txtView1.setText("Name:       "+details.get(0));
            txtView2.setText("Street:     "+details.get(1));
            txtView3.setText("City:       "+details.get(2));
            txtView4.setText("Email:      "+details.get(3));
            txtView5.setText("Mobile:     "+details.get(4));

            lLayout.addView(txtView1);
            lLayout.addView(txtView2);
            lLayout.addView(txtView3);
            lLayout.addView(txtView4);
            lLayout.addView(txtView5);

            linear_root.addView(lLayout);
        }

    }
>>>>>>> 1577842dedb687dc5029a182ab1c5f943db84993
}