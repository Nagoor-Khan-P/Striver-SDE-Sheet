import java.util.Scanner;

public class Set_Matrix_to_Zero {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int[][] mat=new int[n][m];
		
		for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                  mat[i][j]=scan.nextInt();
            }
        }
		
		setZeros(mat);
		
	}
	
	    public static void setZeros(int mat[][]) {
	        // Write your code here..
	        int[] rows=new int[mat.length];
	        int[] cols=new int[mat[0].length];
	        for(int i=0;i<mat.length;i++){
	            for(int j=0;j<mat[0].length;j++){
	                  if(mat[i][j]==0){
	                      rows[i]=0;
	                      cols[j]=0;
	                  }  
	            }
	        }
	        int k=0;
	        for(int i=0;i<mat.length;i++){
	            for(int j=0;j<mat[0].length;j++){
	                  if(rows[k]==0 || cols[k]==0){
	                      mat[i][j]=0;
	                  } 
	            }
	        }
	        
	        
	    }

	}
