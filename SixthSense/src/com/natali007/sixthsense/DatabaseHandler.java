package com.natali007.sixthsense;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper{
	
	 private static final String DATABASE_NAME = "hist.db";
	 public static final String DATABASE_TABLE = "statistics";
	 private static final int DATABASE_VERSION = 2;
	 
	 // names of columns history table
	 public static final String KEY_DATE = "date";
	 public static final String KEY_STEP = "step";
	 public static final String KEY_TIME = "time";
	 private static final String KEY_ID = "_id";
	 
	 // call the constructor of parent and pass the name of the database and the version
	 public DatabaseHandler (Context context) {
		 super (context, DATABASE_NAME, null, DATABASE_VERSION);
		}
	 
	 // create table
	 @Override     
	  public void onCreate(SQLiteDatabase db) { 
		 String DATABASE_CREATE = "CREATE TABLE " + DATABASE_TABLE + "(" + KEY_ID
				 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
				 + KEY_DATE + " TEXT, "
				 + KEY_STEP + " TEXT, "
				 + KEY_TIME + " TEXT);";
		 db.execSQL(DATABASE_CREATE);     
		    }   
	 
	 // Upgrade table
	 @Override     
	  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	  {    }   
	 
	 // add new result
	 public void insertResult(Statistic statistic) {
		 
		    	ContentValues cv = new ContentValues();
		    	cv.put(KEY_DATE, statistic.getDate());
		    	cv.put(KEY_STEP, statistic.getStep());
		    	cv.put(KEY_TIME, statistic.getTime());
		 	
		    	SQLiteDatabase db = this.getWritableDatabase();
		    	db.insert(DATABASE_TABLE, null, cv);
		    	db.close();
	 		}
	 
     // get all results from database
	 public List<Statistic> getAllStatistics(){
		 
		 List<Statistic> statList = new ArrayList<Statistic>();
		 String selectQuery = "SELECT * FROM "+ DATABASE_TABLE;
		 
		 SQLiteDatabase db = this.getWritableDatabase();
	     Cursor cursor = db.rawQuery(selectQuery, null);
		 
	     if (cursor.moveToFirst()) {
	            do {
	            	Statistic stat = new Statistic();
	            	stat.setDate(cursor.getString(1));
	            	stat.setStep(cursor.getString(2));
	            	stat.setTime(cursor.getString(3));
	            	statList.add(stat);
	            } while (cursor.moveToNext());
	          }
	     return statList;
	 }

}
