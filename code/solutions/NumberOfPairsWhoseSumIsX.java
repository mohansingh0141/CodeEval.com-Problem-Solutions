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
import java.util.HashMap;


public class NumberOfPairsWhoseSumIsX {

	
	public static void numOfPairs(String[] s,int x){
		
		
		HashMap<Integer,Boolean> map=new HashMap<Integer, Boolean>();
		int diff;
		int temp;
		int count=1;
		int nopairFlag=0;
		
		
		for(int i=0;i<s.length;i++){
			
			map.put(Integer.parseInt(s[i]), true);
			
		}
		
		for(int i=0;i<s.length;i++){
			temp=Integer.parseInt(s[i]);
			diff=x-Integer.parseInt(s[i]);
			
			if(diff<0){
				diff=diff*(-1);
			}
			if(diff>temp){
				
				if(map.get(diff)!=null){
					
					if(count>1){
						System.out.print(";"+temp+","+diff);
						nopairFlag=1;
					}
					else{
						System.out.print(temp+","+diff);
						++count;
						nopairFlag=1;
					}
				}
			}			
			
		}
		if(nopairFlag==0){
			System.out.print("NULL");
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		File inFile=new File(args[0]); 
		String data;
		String[] splitsOne;
		String[] splitsTwo;
		BufferedReader in= new BufferedReader(new FileReader(inFile)); 
		while((data=in.readLine())!=null){
			
			splitsOne=data.split(";");
			splitsTwo=splitsOne[0].split(",");			 
			numOfPairs(splitsTwo, Integer.parseInt(splitsOne[1]));
			 
		 }
		
		

	}

}
