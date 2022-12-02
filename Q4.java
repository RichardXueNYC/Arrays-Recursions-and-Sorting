
public class Q4 {
	
	public static int zero(int a) {
			
		if (a<0) {
			a= -a;
			return zero(a);
		}
		else if (a > 0) {
	           if (a % 2 == 0) {
	               return 1 + zero(a/2);
	           } else {
	        	   
	               return zero(a/2);
	           }
	       }
	       return 0;
	       
	       
	       
	   }//end of method
	
	public static void main(String[] args) {
		
		//23 has 1 zero: 10111
		System.out.println(zero(23));
		//-9898 has 7 zero: -10011010101010
		System.out.println(zero(-9898));
		//223 has 5 zero: 100010101111
		System.out.println(zero(2223));
	}

}
