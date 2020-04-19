package SortingAlgorithms;

public class SelectionSort {
	
	void sort(int arr[])
	{

		int n = arr.length;
		//int a[]= {23,34,35,21,20} n=4
		for(int i=0;i<n-1;i++)
		{
		//test
		   int minidx=i;
		   for(int j=i+1;j<n;j++)
		      if (arr[j]<arr[minidx])
				 minidx=j;
				//minidx=4
			int  temp=arr[minidx];
			arr[minidx]=arr[i];
			arr[i]=temp;
				  
			      
		   
		  
		
	}
	}
	void  printarray(int arr[]) {
		int n = arr.length;
		for(int i = 0;  i<n ; i++)
		  System.out.println(arr[i] + "  ");
		
	}

	public static void main(String[] args) {
		SelectionSort sr = new SelectionSort();
		
		int a[]= {23,34,35,21,20};
		sr.sort(a);
		sr.printarray(a);
		
		
	}
	

		

}
