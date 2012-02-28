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

public class SumOfPrimes {

	public static boolean isPrime(int n) {
		boolean prime = true;
		for (int i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0) {
				prime = false;
				break;
			}
		if (( n%2 !=0 && prime && n > 2) || n == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int sumOfPrimes(){
		int sum=0;
		int count=1;
		int num=1;
		while(count<=1000){
			
			if(isPrime(num)){
				sum=sum+num;
				++count;
			}
			++num;
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumOfPrimes());
	}

}
