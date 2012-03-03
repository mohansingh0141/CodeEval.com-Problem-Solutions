package code.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MaxSumOfContgIntegerSubArrays {

	
	public static int getMaxSum(String[] data){
		int len=data.length;
		int[] intData=new int[len];
		int sum=0;
		int maxsum;
		int diff;
		int tempsum=0;
		
		for(int i=0;i<len;i++){
			intData[i]=Integer.parseInt(data[i]);			
			sum=sum+intData[i];
		}
		maxsum=sum;
		
		for(int i=0;i<len;i++){
			
			tempsum=tempsum+intData[i];
			diff=maxsum-tempsum;
			if(sum<diff){
				
				sum=diff;				
			}
			
		}
		return sum;
		
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		

		File inFile=new File(args[0]);
		String data;
		String splits[];
		
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));		
		while((data=in.readLine())!=null){	
					
			splits=data.split(",");
			System.out.println(getMaxSum(splits));
						
			
		}
		

	}

}
