package com.oneilldavid.dartscoreboard;

public class CheckoutActivity {
	
	int score;
	String c1,c2,c3;
	String complete;
	boolean noOut = false;
	
	public CheckoutActivity(){
		
	}
	
	public String convertToCheckout(int s){
	
		if(s > 98){
			c1 = threeDart(s);
		} else {
			twoDart(s);
		}
		return complete;
	}

	private void twoDart(int s)
	{
			
	
	}

	private String threeDart(int s)
	{
		String holder;
		
		if(s == 169 || s == 168 || s == 166 || s == 165 || s == 163 || s == 162 || s == 159){
			holder = "No check out";
			noOut = true;
		} else if (s == 125){
			holder = "25";
		} else if (s == 139 || s == 129 || s == 126 || s == 123 || s == 119 || s == 109 || s == 107 || s == 99){
			holder = "T19";
			twoDart(s - 57);
		} else {
			holder = "T20";
			twoDart(s -60);
		}
		return holder;
	}
	
	
}
