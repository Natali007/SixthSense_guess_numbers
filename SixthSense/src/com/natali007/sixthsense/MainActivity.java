package com.natali007.sixthsense;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import com.natali007.sixthsense.R;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	// fields for writing numbers
	private EditText num1;
	private EditText num2;
	private EditText num3;
	private EditText num4;
	
	// buttons with numbers
	private Button but0;
	private Button but1;
	private Button but2;
	private Button but3;
	private Button but4;
	private Button but5;
	private Button but6;
	private Button but7;
	private Button but8;
	private Button but9;
	
	// a list for record attempts of customer 
	private ListView listv;
	private ArrayList<String> numbers;
	private ArrayAdapter <String> adapter;
	
	// timer
	private Chronometer time;
	private CustomArray myCustomArray; 	//create an object of class CustomArray
	private NumbersArray myNumbersArray; 	//create an object of class NumbersArray
	
	private String aa; 	//number of identical numbers at the same positions
	private String bb; 	//number of identical numbers at the different positions
	
	// element of customer array
	int k;
	
	// counters attempts
	int counter;
	
	//strings for date and win
	private String won, calend;
	boolean game;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		k = 0;
		counter = 0;
		num1 = (EditText) findViewById (R.id.num1);
		num2 = (EditText) findViewById (R.id.num2);
		num3 = (EditText) findViewById (R.id.num3);
		num4 = (EditText) findViewById (R.id.num4);
		
		but0 = (Button)findViewById(R.id.but0);
		but1 = (Button)findViewById(R.id.but1);
		but2 = (Button)findViewById(R.id.but2);
		but3 = (Button)findViewById(R.id.but3);
		but4 = (Button)findViewById(R.id.but4);
		but5 = (Button)findViewById(R.id.but5);
		but6 = (Button)findViewById(R.id.but6);
		but7 = (Button)findViewById(R.id.but7);
		but8 = (Button)findViewById(R.id.but8);
		but9 = (Button)findViewById(R.id.but9);
		listv= (ListView) findViewById(R.id.listv);
		time = (Chronometer) findViewById(R.id.time);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat ("dd.MM.yyyy");
		Calendar c = Calendar.getInstance();
		calend = dateFormat.format(c.getTime());
		
		myCustomArray = new CustomArray();	
		myNumbersArray = new NumbersArray();
		myNumbersArray.shuffleArray();
		 
	    numbers = new ArrayList<String>();
		adapter = new ArrayAdapter<String>(this, R.layout.list_item, numbers);
		listv.setAdapter(adapter);
		
		game=true;
		time.start();
	}	
	
	public void onClick(View view){
	    switch (view.getId()) {
	    
	    /* if hit the button, this number record to custom Array and to field, the button is not active */
	    case R.id.but0: {
	    	if (num1.getText().length() == 0)
	    		{ myCustomArray.setCustomArray(k, 0); but0.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
	    	else if (num2.getText().length() == 0)
	    		{myCustomArray.setCustomArray(k, 0); but0.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
	    	else if (num3.getText().length() == 0)
    			{myCustomArray.setCustomArray(k, 0); but0.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
	    	else if (num4.getText().length() == 0)
    			{myCustomArray.setCustomArray(k, 0); but0.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
	    	else break;
	    }
	    
		    case R.id.but1: {
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 1); but1.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 1); but1.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 1); but1.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 1); but1.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
		    
		    case R.id.but2: {
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 2); but2.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{ myCustomArray.setCustomArray(k, 2); but2.setEnabled(false);num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{ myCustomArray.setCustomArray(k, 2); but2.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 2); but2.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
		    
		    case R.id.but3: {
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 3); but3.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 3); but3.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{ myCustomArray.setCustomArray(k, 3); but3.setEnabled(false);num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 3); but3.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
		    
		    case R.id.but4: {
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 4); but4.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 4); but4.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 4); but4.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{ myCustomArray.setCustomArray(k, 4); but4.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
			
		    case R.id.but5: {
		    	
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 5); but5.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 5); but5.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 5); but5.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 5); but5.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
		    
		    case R.id.but6: {
		    	
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 6); but6.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 6); but6.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 6); but6.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 6); but6.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
		    
		    case R.id.but7: {
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 7); but7.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 7); but7.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 7); but7.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 7); but7.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
		    case R.id.but8: {
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 8); but8.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 8); but8.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 8); but8.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 8); but8.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
		    case R.id.but9: {
		    	if (num1.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 9); but9.setEnabled(false); num1.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num2.getText().length() == 0)
		    		{myCustomArray.setCustomArray(k, 9); but9.setEnabled(false); num2.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num3.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 9); but9.setEnabled(false); num3.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else if (num4.getText().length() == 0)
	    			{myCustomArray.setCustomArray(k, 9); but9.setEnabled(false); num4.setText(String.valueOf(myCustomArray.getCustomArrayValue(k))); k++; break;}
		    	else break;
		    }
	    }
	}

	// hit the button Dell to clean the fields
	public void ondellClick(View view) {
		if (num1.getText().length() != 0) {
			k=0;
			but0.setEnabled(true);
			but1.setEnabled(true);	
			but2.setEnabled(true);	
			but3.setEnabled(true);	
			but4.setEnabled(true);	
			but5.setEnabled(true);	
			but6.setEnabled(true);	
			but7.setEnabled(true);	
			but8.setEnabled(true);	
			but9.setEnabled(true);	
			num1.setText("");
			num2.setText("");
			num3.setText("");
			num4.setText("");
		 }
	}
	
	// hit the button Ok
	public void onokClick(View view){
		
		// if all fields is full
		if (num4.getText().length() != 0) {
			
			k=0;
			counter ++;
			int numA = myNumbersArray.compareAarray(myNumbersArray.getNumArray(), myCustomArray.getCustomArray());
			int numB = myNumbersArray.compareBarray(myNumbersArray.getNumArray(), myCustomArray.getCustomArray());
		 	aa = String.valueOf(numA);
		 	bb = String.valueOf(numB);
		 	
		 	// if all numbers identical and on the same positions
		 		if((numA==4) && (numB==0)) {
		 			time.stop();
		 			String t = (String) time.getText();
		 			
		 			// to record to list attempt and congratulations words
		 			numbers.add(0, counter + "." + " " + num1.getText().toString() + num2.getText().toString() + num3.getText().toString() + num4.getText().toString() + 
		 					" "+ "-" + " "+ aa + "A"+ bb +"B");
		 			won = (String) getText(R.string.win); 
		 			numbers.add(0, won ); 
		 			adapter.notifyDataSetChanged();
		 			
		 				// to record to Database: date, numbers of attempts and time
		 				DatabaseHandler dbHelper = new DatabaseHandler(this);
		 				dbHelper.insertResult(new Statistic(calend, String.valueOf(counter), t)); 				
		 
		 				Context context = getApplicationContext();
		 				Toast tot = Toast.makeText(context, R.string.congratulation, Toast.LENGTH_SHORT);
		 				tot.setGravity(Gravity.CENTER, 0, 0);
		 				tot.show();
		 				
		 				but0.setEnabled(false);
		 				but1.setEnabled(false);	
		 				but2.setEnabled(false);	
		 				but3.setEnabled(false);	
		 				but4.setEnabled(false);	
		 				but5.setEnabled(false);	
		 				but6.setEnabled(false);	
		 				but7.setEnabled(false);	
		 				but8.setEnabled(false);	
		 				but9.setEnabled(false);	
		 				num1.setText("");
		 				num2.setText("");
		 				num3.setText("");
		 				num4.setText("");
		 
		 				game=false;
		 		}
		 		
		 		// if numbers not identical or on the different positions
		 		else {
		 		
		 			// to record to list attempt
		 			numbers.add(0, counter + "." + " " + num1.getText().toString() + num2.getText().toString() + num3.getText().toString() + num4.getText().toString() + 
		 					" "+ "-" + " "+ aa + "A"+ bb +"B"); 
		 			adapter.notifyDataSetChanged();
		 			but0.setEnabled(true);
		 			but1.setEnabled(true);	
		 			but2.setEnabled(true);	
		 			but3.setEnabled(true);	
		 			but4.setEnabled(true);	
		 			but5.setEnabled(true);	
		 			but6.setEnabled(true);	
		 			but7.setEnabled(true);	
		 			but8.setEnabled(true);	
		 			but9.setEnabled(true);	
		 			num1.setText("");
		 			num2.setText("");
		 			num3.setText("");
		 			num4.setText("");
		 		}
		}
		
		// if not all fields is full
		else {
			
			Context context = getApplicationContext();
			Toast toast = Toast.makeText(context, R.string.fill, Toast.LENGTH_SHORT);
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
		}
	}
	
	// hit "new game" button
	public void onnewClick(View view){
		if (!game) {
			
			numbers.clear();
			adapter.notifyDataSetChanged();
			myNumbersArray.shuffleArray();			
			k=0;
			counter = 0;
			but0.setEnabled(true);
			but1.setEnabled(true);	
			but2.setEnabled(true);	
			but3.setEnabled(true);	
			but4.setEnabled(true);	
			but5.setEnabled(true);	
			but6.setEnabled(true);	
			but7.setEnabled(true);	
			but8.setEnabled(true);	
			but9.setEnabled(true);	
			num1.setText("");
			num2.setText("");
			num3.setText("");
			num4.setText("");
			time.setBase(SystemClock.elapsedRealtime());
			time.start();
			game=true;
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent intent = new Intent(MainActivity.this, History.class );
			startActivity (intent);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	}

