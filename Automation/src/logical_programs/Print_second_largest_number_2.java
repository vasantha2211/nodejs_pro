package logical_programs;

public class Print_second_largest_number_2 {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[]= {10,12,34,56,7,78};
	      int b;
	      int c=a.length;
	     
	      for(int i=0;i<=c-1;i++) {
	    	  for(int j=i+1;j<c;j++) {
	    		  if(a[i]<a[j]) {                               //if keep '>' will print in descending order
	    			  
	    			  b=a[j];
	    			  a[j]=a[i];
	    			  a[i]=b;
	    			  
	    		  }
	    		 
	    	  }
	    	System.out.println(a[i]);
	    	 
	      }
		
	     
}
}