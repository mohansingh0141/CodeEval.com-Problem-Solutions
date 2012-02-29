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

public class StringExistAtTheEnd {

	public static int isStringExistAtEnd(String a, String b){
		
		int len=b.length();
		int templen=a.length();
		String temp=null;
		if(templen>=len){
			 temp=a.substring(templen-len,templen);
		}
		
		if(b.equals(temp)){
			return 1;
		}
		else{
			return 0;
		}		
	}
	
	public static void main(String[] args) throws IOException {
		File inFile=new File(args[0]); 
		String data;
		String[] splitsOne;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile)); 
		while((data=in.readLine())!=null){
			splitsOne=data.split(",");
			if(splitsOne.length==2){										 
				System.out.println(isStringExistAtEnd(splitsOne[0], splitsOne[1]));
			}
		 }
		

	}

}
