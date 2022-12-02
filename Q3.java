
public class Q3 {
	
	//start is always 0, end is always length -1
	public static int max(int[]a , int start, int end) {
		
		if (start == end) {
			
			return a[start];
		}
		
		int mid = (start+end)/2;
		int max1 = max(a, start,mid);
		int max2 = max(a, mid+1,end);
		
		if (max1<=max2) {
			return max2;
		}
		else {
			return max1;
		}
		
		
		
	}//end of method
	
	public static void main(String[] args) {
		int [] myarray = {1,2,-9,2,66,3,6, 872,-66,67};
		System.out.println(max(myarray,0, myarray.length-1));
		
	}
}
