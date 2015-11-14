package com.natali007.sixthsense;

public class Statistic {
	
	// names of columns history table
		int _id;
		String _date;
		String _step;
		String _time;
		
		public Statistic(){
			
		}
		
		public Statistic (int id, String date, String step, String time) {
			this._id = id;
			this._date =date;
			this._step = step;
			this._time = time;
		}
		
		public Statistic (String date, String step, String time) {
			this._date =date;
			this._step = step;
			this._time = time;
		}
		
		public int getId (){
			return this._id;
		}
		
		public void setId (int id){
			this._id = id;
		}
		
		public String getDate (){
			return this._date;
		}
		
		public void setDate (String date){
			this._date = date;
		}
		
		public String getStep(){
			return this._step;
		}
		
		public void setStep (String step){
			this._step = step;
		}
		
		public String getTime (){
			return this._time;
		}
		
		public void setTime (String time){
			this._time = time;
		}
}
