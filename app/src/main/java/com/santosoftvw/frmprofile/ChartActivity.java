package com.santosoftvw.frmprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChartActivity extends AppCompatActivity {
    LineChart lineChart;
    LineData lineData;
    LineDataSet lineDataSet;
    ArrayList lineEntries;

    PieChart pieChart ;
    ArrayList<PieEntry> entries ;
    ArrayList<String> PieEntryLabels ;
    PieDataSet pieDataSet ;
    PieData pieData ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        lineChart = findViewById(R.id.lineChart);

        lineEntries = new ArrayList<Entry>();
        lineEntries.add(new Entry(0,945f, 1000));
        lineEntries.add(new Entry(1,1040f, 1100));
        lineEntries.add(new Entry(2,1133f, 2000));
        lineEntries.add(new Entry(3,1240f, 3000));
        lineEntries.add(new Entry(4,1369f, 4000));
        lineEntries.add(new Entry(5,1487f, 3000));
        lineEntries.add(new Entry(6,1501f, 6000));
        lineEntries.add(new Entry(7,1645f, 7000));
        lineEntries.add(new Entry(8,1578f, 8000));
        lineEntries.add(new Entry(9,1695f, 9000));

        lineDataSet = new LineDataSet(lineEntries, "No Of Employee");
        lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);

        lineDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        lineDataSet.setValueTextColor(Color.BLACK);
        lineDataSet.setValueTextSize(14f);

        BarChart chart = findViewById(R.id.barchart);

        ArrayList noOfEmp = new ArrayList<BarEntry>();
        noOfEmp.add(new BarEntry(0,945f, 1000));
        noOfEmp.add(new BarEntry(1,1040f, 1100));
        noOfEmp.add(new BarEntry(2,1133f, 2000));
        noOfEmp.add(new BarEntry(3,1240f, 3000));
        noOfEmp.add(new BarEntry(4, 1369f, 4000));
        noOfEmp.add(new BarEntry(5,1487f, 5000));
        noOfEmp.add(new BarEntry(6,1501f, 6000));
        noOfEmp.add(new BarEntry(7,1645f, 7000));
        noOfEmp.add(new BarEntry(8,1578f, 8000));
        noOfEmp.add(new BarEntry(9,1695f, 9000));

        BarDataSet bardataset = new BarDataSet(noOfEmp, "No Of Employee");
        BarData data = new BarData(bardataset);
        chart.setData(data);

        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        bardataset.setValueFormatter(new PercentFormatter());
        chart.animateY(5000);

        pieChart = (PieChart) findViewById(R.id.pieChart);

        entries = new ArrayList<PieEntry>();
        entries.add(new PieEntry((945f*100)/1745, "Y:2011"));
        entries.add(new PieEntry((1040f*100)/1745, "Y:2012"));
        entries.add(new PieEntry((1133f*100)/1745, "Y:2013"));
        entries.add(new PieEntry((1240f*100)/1745, "Y:2014"));
        entries.add(new PieEntry((1369f*100)/1745, "Y:2015"));
        entries.add(new PieEntry((1487f*100)/1745, "Y:2016"));
        entries.add(new PieEntry((1501f*100)/1745, "Y:2017"));
        entries.add(new PieEntry((1645f*100)/1745, "Y:2018"));
        entries.add(new PieEntry((1578f*100)/1745, "Y:2019"));
        entries.add(new PieEntry((1695f*100)/1745, "Y:2020"));

        PieEntryLabels = new ArrayList<String>();
        pieDataSet = new PieDataSet(entries, "No Of Employee");
        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        //RGB = 0-255
        Integer[] colors = {Color.rgb(23,190, 100),
                Color.rgb(223,90, 156),
                Color.rgb(45,150, 239),
                Color.rgb(63,240, 110),
                Color.rgb(99,184, 102),
                Color.rgb(87,211, 123),
                Color.rgb(234,250, 178),
                Color.rgb(168,230, 200),
                Color.rgb(150,19, 250),
                Color.rgb(173,90, 20)
        };

        int[] colors1 = {Color.rgb(223,190, 100),
                Color.rgb(23,190, 156),
                Color.rgb(245,50, 239),
                Color.rgb(253,40, 110),
                Color.rgb(199,84, 102),
                Color.rgb(187,111, 123),
                Color.rgb(34,50, 178),
                Color.rgb(68,230, 200),
                Color.rgb(50,19, 250),
                Color.rgb(73,90, 20)
        };
        //pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setColors(ColorTemplate.createColors(colors1));
        pieDataSet.setValueTextSize(14f);
        pieDataSet.setValueTextColors(Arrays.asList(colors));// ClassType Array is converetd into ArrayList of this Classtype

        //pieChart.setUsePercentValues(false);
        //pieDataSet.setValueFormatter(new PercentFormatter(pieChart));
        pieDataSet.setSliceSpace(4f);
        pieChart.setEntryLabelColor(Color.rgb(123,134,156));
        pieChart.setEntryLabelTextSize(12f);
        pieChart.setDrawEntryLabels(true);
        pieDataSet.setValueLinePart1OffsetPercentage(70.0f);
        pieDataSet.setValueLinePart1Length(0.4f);
        pieDataSet.setValueLinePart2Length(0.2f);
        pieDataSet.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);

        Legend legend = pieChart.getLegend();
        legend.setWordWrapEnabled(true);
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        legend.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        legend.setDrawInside(false);

        pieChart.animateY(10000);
    }
}