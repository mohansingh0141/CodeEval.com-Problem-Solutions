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


public class FirstNonRepeatedCharcter {
	
	public static char firstNonRepeatedChar(String s){
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		char[] data=s.toCharArray();
		int count=0;
		char c=' ';
		
		for(int i=0;i<data.length;i++){
			
			if(map.get(data[i])!=null){
				count=map.get(data[i]);
				map.put(data[i],++count);
			}
			else{
				map.put(data[i], 1);
			}
			
		}
		
		for(int i=0;i<data.length;i++){
			
			if(map.get(data[i])==1){
				c=data[i];
				return c;
			}
			
		}
		return c;
		
	}

	
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]); 
		String data;		
		BufferedReader in= new BufferedReader(new FileReader(inFile)); 
		while((data=in.readLine())!=null){
			 
			System.out.println(firstNonRepeatedChar(data));
			 
		 }
		
	}

}
