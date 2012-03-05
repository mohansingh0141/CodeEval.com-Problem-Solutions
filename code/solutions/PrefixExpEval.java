package code.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class PrefixExpEval {

	
	public static int getResult(String[] s){
		Stack<String> stack=new Stack<String>();
		int num1=0;
		int num2=0;
		int res=0;
		
		for(int i=0;i<s.length;i++){
			
			if(s[i].equals("+")==false&&s[i].equals("*")==false&&s[i].equals("/")==false){
				stack.push(s[i]);				
			}else{
				num1=Integer.parseInt(stack.pop());
				num2=Integer.parseInt(stack.pop());
				
				if(s[i].equals("+")){
					res=num1+num2;
					stack.push(new Integer(res).toString());
				}else if(s[i].equals("*")){
					res=num1*num2;
					stack.push(new Integer(res).toString());
				}else{
					res=num1/num2;
					stack.push(new Integer(res).toString());
				}
				
			}			
			
		}
		res=Integer.parseInt(stack.pop());
		return res;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]);
		String data;
		String[] splits;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			
			splits=new StringBuffer(data.trim()).reverse().toString().split(" ");
			
			System.out.println(getResult(splits));					
		}

		
	}

}
