package code.solutions;
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class SumOfDigits {

	/**
	 * @param args
	 */
	public static int sum(int n){
		
		int sum=0;
		
		while(n>0){
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			
			int n=Integer.parseInt(data);
			
			System.out.println(sum(n));
			
			
		}

	}

}
