
public class Q5 {
	


	public static boolean isPalindrome(String s) {
		s = s.replaceAll("\\s+","");
		s = s.replaceAll("\\p{Punct}", "");
		s = s.toLowerCase();
		
		
		if (s.length()==1||s.length()==0) {
			return true;
		}
		
		else {
			int itslength = s.length();
			if(s.charAt(0)==s.charAt(itslength-1)) {
				//it means the start and the end is the same
				String e = "";
				for (int i =1;i<itslength-1;i++) {
					e = e+s.charAt(i);
					
				}//end of for loop
				
				s = e;
				
				isPalindrome(s);
				return true;
				
			}// end of if
			
			else {
				return false;
			}// end of else

		}//end of else
		
		
		
		
		
	}//end of the method
	
	public static void main(String[] args) {
		
		String string1 = "k!aya_k";
		if(isPalindrome(string1)) {
			System.out.println(string1 + " is a palindrome");
		}else {
			System.out.println(string1 + " is not a palindrome");
		}
		
		
		String string2 = "att";
		if(isPalindrome(string2)) {
			System.out.println(string2 + " is a palindrome");
		}else {
			System.out.println(string2 + " is not a palindrome");
		}
		
		String string3 = "A    23ba!!";
		if(isPalindrome(string3)) {
			System.out.println(string3 + " is a palindrome");
		}else {
			System.out.println(string3 + " is not a palindrome");
		}
		
		
	}//end of the method
}
