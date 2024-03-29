package com.aashish.app.kharcha;

import android.graphics.Color;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.LargeValueFormatter;

import java.util.ArrayList;

public class BarChartExpenseData {
    private ArrayList<BarEntry> expenseAmounts = new ArrayList<>();
    private ArrayList<BarEntry> incomeAmounts = new ArrayList<>();
    private ArrayList<String> categories = new ArrayList<>();

    public void add(String category, int expenseAmount, int incomeAmount) {
        expenseAmounts.add(new BarEntry(expenseAmounts.size(), expenseAmount));
        incomeAmounts.add(new BarEntry(incomeAmounts.size(), incomeAmount));
        categories.add(category);
    }

    public BarData getBarData() {
        BarDataSet expenseBarDataSet = new BarDataSet(expenseAmounts, "Expense");
        expenseBarDataSet.setColors(Color.RED);
        expenseBarDataSet.setValueTextColor(Color.WHITE);
        BarDataSet incomeBarDataSet = new BarDataSet(incomeAmounts, "Income");
        incomeBarDataSet.setColors(Color.GREEN);
        incomeBarDataSet.setValueTextColor(Color.WHITE);

        BarData barData = new BarData(expenseBarDataSet, incomeBarDataSet);
        barData.setValueTextSize(12f);
        barData.setValueFormatter(new LargeValueFormatter());
        return barData;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public int count() {
        return categories.size();
    }
}
