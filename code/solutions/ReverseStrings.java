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


public class ReverseStrings {
	
	public static void reverseString(String in){
		
		StringBuffer inBuff=new StringBuffer(in).reverse();
		
		String temp=inBuff.toString();
		
		String[] splits=temp.split(" ");
		
		StringBuffer out=new StringBuffer("");
		
		for(int i=0;i<splits.length;i++){
			
			out.append(new StringBuffer(splits[i]).reverse());
			out.append(" ");
			
		}
		
		System.out.println(out.toString());	
		
	}
	
	public static void main(String args[]) throws IOException{
		
		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			
			reverseString(data);
			
			
		}
		
	}

}
