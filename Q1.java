//Dear Grader
//I have already asked for extension from Chris due to severe illness (Extending to 11:59 pm, Monday)
//You can check it with him
//Sorry for the inconvenience

//Hope you have a great day



public class Q1 {

	public static int RC(String a, String b) {
		
		a = a.replaceAll("\\s+","");
		b = b.replaceAll("\\s+","");
		
		a = a.toLowerCase();
		b = b.toLowerCase();
				
		char[] array1 = a.toCharArray();
		char[] array2 = b.toCharArray();
		
		
		if (array1.length == array2.length) {
			
			for (int i = 0; i<array1.length;i++) {
				if (array1[i]!=array2[array2.length-1-i]) {
					return 0;
				}
				
				//else {
					//continue;
				//}
				
				
			}
			
			return 1;
			
			
		}
		
		else {
			return 0;
		}
		
		
		
		
	}//end of method
	
	public static void main(String[] args) {
		String a = "data";
		String b = "ata";//0
		
		String a1 = "data";
		String b1 = "ataD";//1
		
		String a2 = "data2";
		String b2 = "2At               aD";//1
		
		String a3 = "data9e";
		String b3 = "E9kt  aD";//0
		
		String d = "de";
		String dd = "dd";//0
		
		
		
		System.out.println(RC(a,b));
		System.out.println(RC(a1,b1));
		System.out.println(RC(a2,b2));
		System.out.println(RC(a3,b3));
		System.out.println(RC(d,dd));
	}
	
	
	
	

}
