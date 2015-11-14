package com.natali007.sixthsense;

public class CustomArray {
	
	// array with customer's numbers
	private int[] customArray = new int [4];

		// to assign a value of element  
	public void setCustomArray(int k, int i){
		this.customArray[k] = i;
	}
		// to get a value of element
	public int getCustomArrayValue(int k){
		return this.customArray[k];
	}
		// to get all values of array
	public int[] getCustomArray(){
		return this.customArray;
	}

}
