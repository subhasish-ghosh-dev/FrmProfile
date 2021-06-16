package com.santosoftvw.frmcourses;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart barChart = (BarChart)findViewById(R.id.avgChart2);
        ArrayList<BarEntry> avgMarks = new ArrayList<BarEntry>();
        avgMarks.add(new BarEntry(1, 46.5f, "CSE 2104"));
        avgMarks.add(new BarEntry(2,65.0f,"CSE2101"));
        avgMarks.add(new BarEntry(3,39.7f,"CSE2102"));
        avgMarks.add(new BarEntry(4,56.0f,"CSE2103"));
        avgMarks.add(new BarEntry(5,76.0f,"CSE2105"));
        avgMarks.add(new BarEntry(6,66.0f,"CSE2106"));

        BarDataSet barDataSet = new BarDataSet(avgMarks,"Avergae Marks of 6 Subjects");
        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);

        // hexadecimal 6 digit #0AFB12   Decimal 0-255 RGB 234, 45, 123
        int[] colors = {Color.BLACK, Color.BLUE, Color.rgb(125, 0, 200),
                Color.GRAY, Color.YELLOW, Color.GREEN  };
        barDataSet.setColors(ColorTemplate.createColors(colors));
        barDataSet.setValueTextColor(Color.BLUE);
        barDataSet.setValueTextSize(10f);

        barChart.setFitBars(true);
        barChart.setHorizontalScrollBarEnabled(true);
        barChart.setVerticalScrollBarEnabled(true);

        barDataSet.setValueFormatter(new PercentFormatter());

        barChart.setBackgroundColor(Color.rgb(200,200,200));
        barChart.animateXY(4000, 4000);
    }
}