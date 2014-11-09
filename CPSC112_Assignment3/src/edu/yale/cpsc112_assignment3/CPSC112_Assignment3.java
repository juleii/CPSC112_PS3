package edu.yale.cpsc112_assignment3;

import java.util.Random;

public class CPSC112_Assignment3 {

  public static String mySecret = "";
  public static boolean DEBUG = true;
  public static Random r = new Random();

  public static void main(String[] args) {
    makeMySecret();
	
	//System.out.println("abc".charAt(0));
    /*isGameOver("1234");
    isGameOver("4321");
    isGameOver("2567");
    isGameOver("1432");*/
  }

  public static void makeMySecret() {
	  mySecret = " ";
	  String temp = "";
	  while(mySecret.length() <= 4){
		  int digit = r.nextInt(6)+1;
		  temp = temp + Integer.toString(digit);
			for (int j = 0; j < mySecret.length(); j++){
			  if (digit == Character.getNumericValue(mySecret.charAt(j))){
				  break;
			  }
			  if(j >= mySecret.length() - 1){
				  mySecret = mySecret + Integer.toString(digit); // converts int to string
			  }
		  } 
	  }
    if (DEBUG){
       System.out.println(mySecret);
    }
  }
  //public static boolean isGuessValid(String input) {
    // Part 2 code goes here
 // }

 // public static boolean isGameOver(String input) {
    // Parts 3 and 4 code goes here
 // }
}
