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
import java.util.*;
import java.io.*;
import java.lang.NumberFormatException;


public class self_describing_numbers{

	public static int isSelfDescribing(String data){
	
		HashMap<Integer,Integer> mapOne=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> mapTwo=new HashMap<Integer,Integer>();
		
		char nums[]=data.toCharArray();
		int count;
		int flag=1;		
		int shouldBe=0;
		int is=0;		
		int rem;

		for(int j=0;j<nums.length;j++){			
			rem=Integer.parseInt(new Character(nums[j]).toString());
			mapOne.put(j,rem);
			if(mapTwo.get(rem)!=null){
				
				count=mapTwo.get(rem);
				mapTwo.put(rem,++count);
			}else{
				mapTwo.put(rem,1);

			}

		}
		
	
		for(int k=0;k<nums.length;k++){
			
			shouldBe=mapOne.get(k);
			
			if(mapTwo.get(k)!=null){
				is=mapTwo.get(k);
			}else{
				is=0;
			}
			if(shouldBe!=is){
				flag=0;
			}
		
		}

	return flag;

		
	}

	public static void main(String[] args) throws NumberFormatException, IOException { 
		File inFile=new File(args[0]); 
		String data;		
		BufferedReader in= new BufferedReader(new FileReader(inFile)); 
		while((data=in.readLine())!=null){
			 
			System.out.println(isSelfDescribing(data));
			 
		 }
		
	 } 


}
