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
import java.util.Arrays;



public class jolly_jumpers {

	public static String isJollyJumper(String[] nums){
		
		int diff[]=new int[nums.length-1];
		int data[]=new int[nums.length-1];
	
		
		for(int i=1;i<=nums.length-1;i++){
			int diffSingle= Integer.parseInt(nums[i-1])-Integer.parseInt(nums[i]);
			if(diffSingle<0){
				diffSingle=diffSingle*(-1);
			}
			diff[i-1]=diffSingle;
			data[i-1]=i;
			
		}
		
		Arrays.sort(diff);		
		Arrays.sort(data);
		
		if(Arrays.equals(data, diff)){
			return "Jolly";
		}else{
			return "Not jolly";
		}
			
	}
	
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]); 
		String data;
		String splits[];
		BufferedReader in= new BufferedReader(new FileReader(inFile)); 
		while((data=in.readLine())!=null){
			 splits=data.split(" ");
			System.out.println(isJollyJumper(splits));
			 
		 }

	}

}
