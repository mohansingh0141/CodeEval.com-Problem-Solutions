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
import java.util.Iterator;
import java.util.TreeSet;


public class UniqueElements {
    
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		File inFile=new File(args[0]);
		String data;
		int count=0;
		
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			count=0;
			TreeSet<Integer> dataSet= new TreeSet<Integer>();
			
			String temp[]=data.split(",");
			
			for(int i=0;i<temp.length;i++){
				
				dataSet.add(Integer.parseInt(temp[i]));
			}
			
			Iterator<Integer> i=dataSet.iterator();
			
			while(i.hasNext()){
				
				if(count==0){
					System.out.print(i.next());
					count++;
				}
				else{
					System.out.print(","+i.next());
				}
			}
			System.out.println();
			
			
			
			
			
		}
		
	}

}
  
