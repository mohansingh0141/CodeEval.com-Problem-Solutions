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
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

//Code is fine but not working properly

public class DoubleSquares {
	
	public static void doubleSquares(double x){
		
		
		HashMap<Integer,Boolean> map=new HashMap<Integer, Boolean>();
		double diff;
		double tempstore;
		int temp;		
		int nopairFlag=0;
		int paircount=0;
		
		
		for(int i=0;i<=x;i++){
			
			map.put(i, true);
			
		}
		
		for(int i=0;i<=x;i++){
			temp=i;
			diff=Math.sqrt(x-Math.pow(i,2));
			tempstore=(double)(int)diff;
			
			if(diff==tempstore){
				
				if(diff<0){
					diff=diff*(-1);
				}
				if(diff>=temp){
					
					if(map.get((int)diff)!=null){
						paircount++;
						nopairFlag=1;
					}
				}	
			}
					
			
		}
		if(nopairFlag==0){
			System.out.println(0);
		}else{
			System.out.println(paircount);
		}
		
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 
		Scanner scan=new Scanner(System.in);
		int num_test_cases=scan.nextInt();
		int num=0;
		
		for(int i=0;i<num_test_cases;i++){
			num=scan.nextInt();
			doubleSquares(num);
			
		}
		
	}

}
