import java.util.* ;
	import java.io.*;
	import java.util.ArrayList;
public class Repeated_Number {
	
	    public static int findDuplicate(ArrayList<Integer> arr, int n){
	        // Write your code here.
	        int[] freq=new int[n+1];
	        for(int i=0;i<n;i++){
	            if(freq[arr.get(i)]==0){
	                freq[arr.get(i)]+=1;
	            }
	            else{
	                return arr.get(i);
	            }
	        }
	        return 0;
	}

}
