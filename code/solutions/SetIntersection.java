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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;


public class SetIntersection {

	public static void setIntersect(String A, String B){
		
		int count=0;
		
		String[] splitsA=A.split(",");
		String[] splitsB=B.split(",");
		
		HashMap<Integer,Boolean> dataSet=new HashMap<Integer,Boolean>();
		
		for(int i=0;i<splitsA.length;i++){
			
			dataSet.put(Integer.parseInt(splitsA[i]),true);
			
		}
		
		for(int i=0;i<splitsB.length;i++){
			
			if(dataSet.get(Integer.parseInt(splitsB[i]))!=null){
				
				if(count==0){
					System.out.print(Integer.parseInt(splitsB[i]));
					count++;
				}
				else{
					System.out.print(","+Integer.parseInt(splitsB[i]));
				}
				
			}
			
		}
		System.out.println();
		
		
	}
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			
			String temp[]=data.split(";");
			String A=temp[0];
			String B=temp[1];
						
			setIntersect(A, B);
			
		}

	}

}
