package com.natali007.sixthsense;


import java.util.ArrayList;
import java.util.List;

import com.natali007.sixthsense.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class History extends Activity {
	
	private ArrayList<String> hist;
	private ArrayAdapter <String> adapt;
	private ListView listh;
	private String datt, stepp, timm;

	@Override 
	protected void onCreate(Bundle savedinstancestate) { 
		super.onCreate(savedinstancestate); 
		setContentView(R.layout.activity_list);
		
		// names of columns history table
		datt=(String) getText(R.string.date);
		stepp=(String) getText(R.string.step);
		timm=(String) getText(R.string.time);
		
		// list for record results of customer 
		listh= (ListView) findViewById(R.id.list_h);
		hist = new ArrayList<String>();
		adapt = new ArrayAdapter<String>(this, R.layout.list_history, hist);
		listh.setAdapter(adapt);
		
		// create a new object DatabaseHandler
		DatabaseHandler basa = new DatabaseHandler(this);
		
		// get all results from database
        List<Statistic> stat = basa.getAllStatistics();
        
        // write all results to list 
        for (Statistic cn: stat) {
            hist.add(datt + " "+ cn.getDate() + "\n"+ stepp + " "+ String.valueOf(cn.getStep())+ timm + " "+ cn.getTime());
            adapt.notifyDataSetChanged();
        }
	}    

}
