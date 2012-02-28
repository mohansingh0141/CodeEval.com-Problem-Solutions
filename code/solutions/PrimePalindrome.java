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
public class PrimePalindrome {

	public static boolean isPrime(long n) {
		boolean prime = true;
		for (long i = 3; i <= Math.sqrt(n); i += 2)
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
	
	public static boolean isPalindrome(long n){
		
		long temp=0;
		long temp1=n;
		
		while(temp1!=0){
			
			temp=temp*10+temp1%10;
			temp1=temp1/10;
		}
		
		if(temp==n){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static long bigggestPrimePalindrome(){
		
		for(long i=1000;i>=1;i--){
			
			if(isPrime(i)){
				if(isPalindrome(i)){
					return i;
				}
			}		
		}
		return 0;
		
	}
	public static void main(String[] args) {
		
		System.out.println(bigggestPrimePalindrome());

	}

}
