package com.natali007.sixthsense;

import java.util.Random;

public class NumbersArray {
	
private int[] numArray={0,1,2,3,4,5,6,7,8,9};

		//to get all values of array
	public int[] getNumArray(){
		return this.numArray;
	}
	
	//method for shuffle Array
	private void shuffArray(int[] ar) {
		Random rnd = new Random();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}
	
	public void shuffleArray(){
		shuffArray(numArray);
	}
	
	// method for compare arrays, search for identical elements at the same positions
	public int compareAarray(int[] pc, int[] player) {
		int A = 0;
		int z = 0;
		while (z<=3) {
			if (player[z]==pc[z])
				{A++;}
			z++;
		}
		 return A;
	}	
	
	// method for compare arrays, search for identical elements at the different positions
	public int compareBarray(int[] pc, int[] player) {
		int B = 0;
		int i = 0;
		while (i<=3){
			for (int j = 0; j <= 3; j++){
					if ((player[i]==pc[j]) && (i!=j))
					B++;
			}
			    i++;
		}
		 return B;
	}

}
