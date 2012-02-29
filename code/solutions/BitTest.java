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


public class BitTest {

	public static boolean isBitsSame(int n, int p1,int p2){
		p1=p1-1;
		p2=p2-1;
		int temp=(n >>> p1) & 1;
		int temp2=(n >>> p2) & 1;
		
		int res= temp ^ temp2;
		
		if(res==0){
			
			return true;
			
		}else{
			
			return false;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		File inFile=new File(args[0]); 
		String data;	
		String[] splits;
		BufferedReader in= new BufferedReader(new FileReader(inFile)); 
		while((data=in.readLine())!=null){			
			splits=data.split(",");			 
			System.out.println(isBitsSame(Integer.parseInt(splits[0]),Integer.parseInt(splits[1]),Integer.parseInt(splits[2])));
			 
		 }

	}

}
