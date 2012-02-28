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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class pangrams {

	public static void pg(String s){
		
		char data[]=s.toLowerCase().toCharArray();
		int flag=1;
		StringBuffer out=new StringBuffer("");
		
		Arrays.sort(data);
		
		HashMap<Character, Boolean> hmap=new HashMap<Character, Boolean>();
		
		for(int i=0;i<data.length;i++){
			
			hmap.put(data[i], true);
		}
		int val=97;
		char c;
		
		for(int i=1;i<=26;i++){
			c=(char)val++;
			if(hmap.get(c)==null){
				out.append(c);
				flag=1;
			}
			else{
				flag=0;
			}
			
		}
		//System.out.println();
		if(flag==0){
			System.out.println("NULL");
		}
		else{
			System.out.println(out.toString());
		}
		
	}
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			
			
			pg(data);			
			
		}

	}

}
