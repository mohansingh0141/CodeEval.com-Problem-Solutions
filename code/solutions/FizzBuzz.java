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


public class FizzBuzz {

	public static void getOutput(int A, int B, int N){
		
		for(int i=1;i<=N;i++){
			
			if(i%A==0 && i%B==0){
				
				System.out.print("FB ");
			}else if(i%A==0){
				System.out.print("F ");
			}else if(i%B==0){
				System.out.print("B ");
			}else{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
	}
	public static void main(String[] args) throws IOException {
		
		File inFile=new File(args[0]);
		String data;
		
		BufferedReader in= new BufferedReader(new FileReader(inFile));
		
		while((data=in.readLine())!=null){
			
			String temp[]=data.split(" ");
			int A=Integer.parseInt(temp[0]);
			int B=Integer.parseInt(temp[1]);
			int N=Integer.parseInt(temp[2]);
			
			getOutput(A, B, N);
			
			
		}
		

	}

}
