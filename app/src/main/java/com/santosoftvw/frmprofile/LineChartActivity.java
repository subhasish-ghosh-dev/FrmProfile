package com.santosoftvw.frmcourses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;

public class LineChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);

        LineChart lineChart = (LineChart)findViewById(R.id.avgChart3);
        ArrayList<Entry> avgMarks = new ArrayList<Entry>();
        avgMarks.add(new Entry(1, 46.5f, "CSE 2104"));
        avgMarks.add(new Entry(2,65.0f,"CSE2101"));
        avgMarks.add(new Entry(3,39.7f,"CSE2102"));
        avgMarks.add(new Entry(4,56.0f,"CSE2103"));
        avgMarks.add(new Entry(5,76.0f,"CSE2105"));
        avgMarks.add(new Entry(6,66.0f,"CSE2106"));

        LineDataSet lineDataSet = new LineDataSet(avgMarks,"Avergae Marks of 6 Subjects");
        LineData lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);

        lineDataSet.setValueFormatter(new PercentFormatter());
        lineChart.animateXY(4000,4000);
    }
}