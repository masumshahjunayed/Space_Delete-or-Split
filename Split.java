package com.stdio.First;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = new String("Daffodil-International-University");
	    System.out.println("Return Value :" );      
	      
	    for (String retval: Str.split("-")){
	    	System.out.println(retval);
	    }

	}

}
