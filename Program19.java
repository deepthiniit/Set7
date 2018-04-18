
package com.niit;

public class Program19 {
	public static void main(String[] args){
		int arr1[]={12,13,14,15,16,17};
		int arr2[]={2,3,4,5,6};
		int even=0;int odd=0;
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(i%2!=0){
					odd += arr1[i];
				}else{
					even += arr2[i];
				}
				System.out.println("even index positions :"+ even);
				System.out.println("odd index positions :" + odd);
			}
		}
		
	}

}
