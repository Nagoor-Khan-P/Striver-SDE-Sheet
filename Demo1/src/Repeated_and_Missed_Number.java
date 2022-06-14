import java.util.ArrayList;

public class Repeated_and_Missed_Number {
	
	 public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
	        // Write your code here
	        int[] array=new int[arr.size()+1];
	        for(int i=0;i<arr.size();i++){
	            array[arr.get(i)]=array[arr.get(i)]+1;
	        }
	        int repeated=0,missed=0;
	        for(int i=1;i<array.length;i++){
	           if(array[i]==2){
	               repeated=i;
	           }
	           if(array[i]==0){
	               missed=i;
	           }
	        }
	        int[] res=new int[2];
	        res[0]=missed;
	        res[1]=repeated;
	        return res;
	       
	    }
	}
