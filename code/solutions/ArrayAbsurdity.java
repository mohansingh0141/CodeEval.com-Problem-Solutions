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


public class ArrayAbsurdity {
	
	public static int duplicate(String[] nums){
		
		HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();		
		int num=0;		
		for(int i=0;i<nums.length;i++){
			num=Integer.parseInt(nums[i]);
			if(hmap.get(num)!=null){	
				return num;				
			}else{
				hmap.put(num, 1);
			}		
		}		
		return num;
	}

	
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));		
		while((data=in.readLine())!=null){
			
			
			
			String[] splits=data.split(";");
			if(splits.length==2){
				String[] dataS=splits[1].split(",");				
				System.out.println(duplicate(dataS));
				
			}
						
			
		}
		

	}

}
