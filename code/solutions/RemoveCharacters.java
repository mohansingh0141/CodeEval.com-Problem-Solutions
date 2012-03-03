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


public class RemoveCharacters {
	
	public static String removeChar(String s, String ch){
		
		char[] chr=ch.toCharArray();		
		int len=chr.length;
		
		StringBuffer outStr=new StringBuffer("");
		HashMap<Character, Boolean> map= new HashMap<Character, Boolean>();
		
		for(int i=1;i<len;i++){
			
			map.put(chr[i],true);
			
		}
		for(int i=0;i<s.length();i++){
			
			if(map.get(s.charAt(i))==null){
				
				outStr.append(s.charAt(i));
			}
			
		}
		return outStr.toString().trim();
		
	}
	
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));		
		while((data=in.readLine())!=null){			
			String[] splits=data.split(",");
			if(splits.length==2){
								
				System.out.println(removeChar(splits[0], splits[1]));
				
			}
						
			
		}
		

	}


}
