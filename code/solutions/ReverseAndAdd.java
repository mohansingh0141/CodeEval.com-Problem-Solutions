/*
 * Copyright 2012 Mohan Singh.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package code.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReverseAndAdd {
	
	public static boolean isPalindrome(StringBuffer num){
		String orig=num.toString();
		String comp=num.reverse().toString();
		
		if(orig.equals(comp)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static int rev_add(StringBuffer num){
		
		long n=Long.parseLong(num.toString());
		long rev=Long.parseLong(num.reverse().toString());
		
		int count=1;
		long temp=n+rev;
		
		while(!isPalindrome(new StringBuffer(Long.toString(temp)))){
			rev=Integer.parseInt(new StringBuffer(Long.toString(temp)).reverse().toString());
			temp=temp+rev;			
			++count;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) throws IOException{
		

		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));		
		while((data=in.readLine())!=null){			
			
			System.out.println(rev_add(new StringBuffer(data.trim())));
						
			
		}
		
	}

}
