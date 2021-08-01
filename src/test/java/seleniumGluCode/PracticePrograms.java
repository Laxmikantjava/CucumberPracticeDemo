package seleniumGluCode;

public class PracticePrograms {
	public static void main(String[] args) {
		/*
		 * String name ="Laxmikant"; String rev=""; for(int i=name.length()-1;i>=0;i--)
		 * {
		 * 
		 * rev = rev+name.charAt(i); } System.out.println(rev); }
		 */
		// print duplicate array
		/*
		 * int arr[] = { 3, 2, 4, 5, 2, 6, 4, };
		 * 
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * for (int j = i + 1; j < arr.length; j++) {
		 * 
		 * if (arr[i] == arr[j]) { System.out.print(" " + arr[j]); }
		 * 
		 * }
		 * 
		 * }
		 */
		// Print the arrays present on odd and even postion
		// i=0 ==> it will print odd and i=1 then it will print even postion
		/*
		 * int arr[] = {3,4,5,7,4,1,6,7,7,8,9,9};
		 * 
		 * 
		 * for(int i =1;i<arr.length;i=i+2) { System.out.println(arr[i]); }
		 * 
		 * 
		 */

		/*
		 * int arr[] = {3,4,5,7,4,1,6,7,7,8,9,9};
		 * 
		 * 
		 * for(int i =1;i<arr.length;i=i+1) { System.out.println(arr[i]); }
		 */

		//===============================================
		// find maximum number in array
	/*	int arr[] = { 1,3,2,45,76,89,66,5,44,};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
System.out.println(max);
		}*/
		//=====================================
//String: Count total number of char in string
		
		/*String name = "automation Tester";
		int count=0;
		for (int j = 0; j < name.length(); j++) {
			if(name.charAt(j)!= ' ')
			count++;
		}
		
		System.out.println(count);*/
	/*	======================================
		Sum of all the element in array
		int sum=0;
		int arr[] = {3,4,6,2,3,5};
		for(int i=0;i<arr.length;i++){
		sum = sum+arr[i];
		}
		System.out.println(sum);*/
		
	}
}