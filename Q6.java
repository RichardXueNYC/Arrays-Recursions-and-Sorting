import java.util.Arrays;
//To import this is purely to quickly print every element within the array







public class Q6 {

	
	public static void main(String[] args) {
		//Test area
		//If they all have the same results
		//it should be good
		
		int [] myarray1 = {4,77,98,30,20,50,77,22,49,2};
		System.out.println(Arrays.toString(BubbleSort(myarray1)));
		
		
		int [] myarray2 = {4,77,98,30,20,50,77,22,49,2};
		System.out.println(Arrays.toString(RecursiveBubbleSort(myarray2, myarray2.length)));
		
		int [] myarray3 = {4,77,98,30,20,50,77,22,49,2};
		System.out.println(Arrays.toString(SelectionSort(myarray3)));
		
		
		
		int [] myarray4 = {4,77,98,30,20,50,77,22,49,2};
		System.out.println(Arrays.toString(InsertionSort(myarray4)));
		
		
		
		
		int [] myarray5 = {4,77,98,30,20,50,77,22,49,2};
		System.out.println(Arrays.toString(MergeSort(myarray5, myarray5.length)));
		
		
		
		int [] myarray6 = {4,77,98,30,20,50,77,22,49,2};
		System.out.println(Arrays.toString(QuickSort(myarray6, 0, myarray6.length-1)));
	
	}
	
	//First, here is my understanding about Bubble Sort
	public static int[] BubbleSort(int array[]){
    
        
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    					  }
                
            									}
            //System.out.println(Arrays.toString(array));							
            }
        
        
        return array;

												}//end of method
	
	
	public static int[] RecursiveBubbleSort(int array[], int size) {
		
		if (size ==1) {
			return array;
		}
		else {
		for (int i =0;i<array.length-1;i++) {
			if (array[i]>array[i+1]) {
				
				 int temp = array[i];
	                array[i] = array[i+1];
	                array[i+1] = temp;
			}
			
			
		
		}//end of for
		//System.out.println(Arrays.toString(array));
		return RecursiveBubbleSort(array,size-1);
		
		}
		
	}//end of method2
	
	public static int[] SelectionSort(int [] array) {
		
		int temp;
		//int size = array.length;
		
		for (int i = 0; i<array.length;i++) {
			int minimum = i;
			for (int j = i+1; j < array.length; j++)
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
			
			temp = array[minimum];
			array[minimum] = array[i];
			array[i] = temp;
			
			//System.out.println(Arrays.toString(array));	
		}//end of for
		
		return array;
		
		
	}//end of method3
	
	public static int[] InsertionSort(int array[]) {
		//int size = array.length;
		
		for (int i = 1;i<array.length;i++) {
			int q = i;
			int temp = array[i];
			
			while(q>0 && temp<array[q-1]) {
				array[q] = array[q-1];
				q=q-1;
				
			}
			
			
			array[q] = temp;	
			//System.out.println(Arrays.toString(array));
		}//end of for
		
		return array;
		
	}//end of method4
	
	public static int [] MergeSort(int[] array, int size) {
		
		//size stands for 
		if (size<2) {
			return array;
		};
		
		int mid = size / 2;
	    int[] left = new int[mid];
	    int[] right = new int[size - mid];

	   
	    for (int i = mid; i < size; i++) {
	        right[i - mid] = array[i];
	    }
	    for (int i = 0; i < mid; i++) {
	        left[i] = array[i];
	    }
	    
	     MergeSort(left, mid);
	     MergeSort(right, size - mid);
	     
	    return merge(array, left, right, mid, size - mid);
		
		
		
	}//end of method5
	
	
		
	public static int [] merge(int[] array, int[] left, int[] right, int leftin, int rightin) {
			 
			    int i = 0; 
			    int j = 0;
			    int k = 0;
			    
			    while (i < leftin && j < rightin) {
			        if (left[i] <= right[j]) {
			            array[k++] = left[i++];
			        }
			        else {
			            array[k++] = right[j++];
			        }
			    }
			    while (i < leftin) {
			        array[k++] = left[i++];
			    }
			    while (j < rightin) {
			        array[k++] = right[j++];
			    }
			    
			    
			    return array;
			}//end of method merge
		
		
		
	
	
	public static int[] QuickSort(int array[], int low, int high) {
		
		if (low < high) {
			int partitionkey = Partition(array, low, high);
			
			QuickSort(array, low, partitionkey-1);
			QuickSort(array, partitionkey+1, high);
			
			
		}
		
		return array;
	}
	
	public static int Partition(int array[], int low, int high) {
		
		
		int pivot = array[high];
		int temp;
		int key = low -1;
		
		for (int i = low; i<=high-1;i++) {
			
			if (array[i]<=pivot) {
				key++;
				temp = array[key];
				array[key] = array[i];
				array[i] = temp;
			}
			
			
		}//end of for
		
		temp = array[key+1];
		array[key+1] = array[high];
		array[high] = temp;
		//System.out.println(Arrays.toString(array)); 
		return (key+1);
		
		
		
		
		
		
	
	}
	
	
}//end of class
