package salesbyMatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class salesByMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar =new ArrayList<Integer> ();
		int n=9;
		ar.add(10);
	    ar.add(20);
	    ar.add(20);
	    ar.add(10);
	    ar.add(10);
	    ar.add(30);
	    ar.add(50);
	    ar.add(10);
	    ar.add(20);
		
	    sockMerchant(n,ar);

	}
	public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
	    Map<Integer,Integer> set= new HashMap<Integer,Integer> ();
	    
	    
	    int countColor=1;
	    int numpair=0;
	    for(int i=0;i<ar.size();i++){
	        if(set.containsKey(ar.get(i))){
	           countColor=set.get(ar.get(i))+1;
	           set.put(ar.get(i),countColor);

	        }else {
	        set.put(ar.get(i),countColor);
	        }
	        countColor=1;
	    }
	    
	    
	    
	    for (int num : set.values())
	    	numpair=numpair+(num/2);
	   System.out.println(numpair);
	      return  numpair;    
	    
	    }

}
