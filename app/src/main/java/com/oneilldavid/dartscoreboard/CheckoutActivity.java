package com.oneilldavid.dartscoreboard;

public class CheckoutActivity {
	
	int score;
	boolean noOut = false;
    int [] scores = new int[110];
    String [] checkout = {"20 D20","T15 D8","T10 D16","T13 D12","T16 D8","T19 D4","T10 D18","T17 D8","T20 D4","T15 D12","T10 D20","T13 D16","T16 D12","T19 D8","T14 D16","T17 D12","T20 D8","T19 D10","T18 D12","T13 D20",
            "T20 D10","T19 D12","T14 D20","T17 D16","T20 D12","T15 D20","T18 D16","T17 D18","T16 D20","T19 D16","T20 D15","T17 D20","T20 D16","T19 D18","T18 D20","T19 D19","T20 D18","T19 D20","T20 D19","T20 D20",
            "T19 10 D16","T20 1 D20","T20 10 D16","T20 3 D20","T18 18 D16","T19 16 D16","T20 14 D16","T19 18 D16","T20 16 D16","T19 20 D16","T20 18 D16","T20 19 D16","T20 12 D20","T20 13 D20","T20 14 D20","T20 15 D20","T20 16 D20","T20 17 D20","T20 18 D20","T19 T10 D16",
            "T20 20 D20","T17 T10 D20","T18 T20 D4","T19 T16 D9","T20 T16 D8","25 T20 D20","T19 T19 D6","T20 T17 D8","T18 T14 D16","T19 T16 D12","T20 20 Bull","T20 T13 D16","T20 T16 D12","T20 T19 D8","T20 T14 D16","T20 T17 D12","T20 T20 D8","T19 T16 D16","T20 T18 D12","T19 T14 D20",
            "T20 T16 D16","T20 T19 D12","T20 T14 D20","T20 T17 D16","T20 T20 D12","T20 T15 D20","T20 T18 D16","T20 T17 D18","T20 T16 D20","T20 T19 D16","T20 T18 D18","T20 T17 D20","T20 T20 D16","T20 T19 D18","T20 T18 D20","T20 T19 D19","T20 T20 D18","T20 T19 D20","T20 T20 D19","No out shot",
            "T20 T20 D20","T20 T17 Bull","No out shot","No out shot","T20 T18 Bull","No out shot","No out shot","T20 T19 Bull","No out shot","No out shot","T20 T20 Bull"};


	public CheckoutActivity(){

        int len = scores.length;
        int j = 60;
        for(int i = 0;i < len;i ++){
           scores[i] = j;
            j++;
        }
    }

	public String convertToCheckout(int s){

        String holder = "";

		if(s == 169 || s == 168 || s == 166 || s == 165 || s == 163 || s == 162 || s == 159){
			holder = "No check out";
			noOut = true;
		}

		return holder;
	}


	
}
