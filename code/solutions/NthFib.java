package code.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NthFib {

	
	
	public static int getNthFib(int n){
		int f0=0;
		int f1=1;
		int fn;
		if(n==0){
			return f0;
		}else if(n==1){
			return f1;
		}else{
			
			fn=getNthFib(n-1)+getNthFib(n-2);		
		}
		
		return fn;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		File inFile=new File(args[0]);
		String data;
		int num;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			num=Integer.parseInt(data.trim());
			System.out.println(getNthFib(num));					
		}

	}

}
