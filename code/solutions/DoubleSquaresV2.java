
package code.solutions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;



public class DoubleSquaresV2 {
	
	public static void doubleSquares(double x){
		
		
		HashMap<Integer,Boolean> map=new HashMap<Integer, Boolean>();
		double diff;
		double tempstore;
		int temp;		
		int nopairFlag=0;
		int paircount=0;
		
		
		for(int i=0;i<=x;i++){
			
			map.put(i, true);
			
		}
		
		for(int i=0;i<=x;i++){
			temp=i;
			diff=Math.sqrt(x-Math.pow(i,2));
			tempstore=(double)(int)diff;
			
			if(diff==tempstore){
				
				if(diff<0){
					diff=diff*(-1);
				}
				if(diff>=temp){
					
					if(map.get((int)diff)!=null){
						paircount++;
						nopairFlag=1;
					}
				}	
			}
					
			
		}
		if(nopairFlag==0){
			System.out.println(0);
		}else{
			System.out.println(paircount);
		}
		
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 
		File inFile=new File(args[0]);
		//String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		int n=Integer.parseInt(in.readLine().trim());
		double x;
		
		for(int i=0;i<n;i++){
			
			x=Double.parseDouble(in.readLine().trim());
			doubleSquares(x);
			
			
		}
		
	}

}
