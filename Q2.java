
public class Q2 {

	public static String consec(String a) {
		
		//Because the list of strings is larger than 3 and 
		//the number of strings in your sentence is a multiple of 3
		
		//The length of the array is also an multiple of 3
		String[] arr = a.split(" ");
		String answer = "";
		
		int f = 0;
		int s = 1;
		int t = 2;
		
		for (int i = 0; i<(arr.length/3);i++) {
			
			String string1 = arr[f+i*3];
			String string2 = arr[s+i*3];
			String string3 = arr[t+i*3];
			
			int l1 = string1.length();
			int l2 = string2.length();
			int l3 = string3.length();
			
			int minvec = Math.min(l1, Math.min(l2, l3));
			if (l1==minvec) {
				answer = answer+string1+" ";
			}
			else if (l2 ==minvec) {
				answer = answer+string2+" ";
			}
			else if (l3 == minvec) {
				answer = answer+string3+" ";
			}
			
			
		}//end of for
		
		return answer;
		
		
		
	}//end of method
	
	public static void main(String[] args) {
		
		String myString = "Other entries include a historic district in Charlottesville Virginia cut-flower greenhouse complex";
		
		System.out.println(consec(myString));
		
		//Leave the first one aaa if it's the same as bbb
		String myString2 = "Other entries include aaa bbb vvvcc";
		
		System.out.println(consec(myString2));
	}
	
	
	
}
