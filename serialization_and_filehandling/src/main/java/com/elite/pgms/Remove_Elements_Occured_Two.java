package com.elite.pgms;

public class Remove_Elements_Occured_Two {
	
	
	int count=0;

	public static void main(String[] args) {

		int arr[]=  {1,2,2,5,66,66,25,5,96,8,4,5,6,1,2,3};
		int arr_elements_size = arr.length;
		Remove_Elements_Occured_Two rem = new Remove_Elements_Occured_Two();
		rem.remove_Elements_Occured_Two(arr, arr_elements_size);

		
	}
	
	void remove_Elements_Occured_Two(int arr[], int arr_size)  
    { 
         int i,j;
        for ( i = 0; i < arr_size; i++)  
        { 
            for ( j = i + 1; j < arr_size; j++)  
            { 
                if (arr[i] == arr[j]) 
                	count++;
                    
                    
                
                
                
            } 
           
        } 
        if (count==2) {
			System.out.println(arr[i] );
		} else {
			System.out.println("no element repeated twice");
		}

    }
}
