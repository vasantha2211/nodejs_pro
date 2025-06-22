package logical_programs;

public class Print_min_number_max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,2,4,1};
		int min=a[0];
		int max=a[0];
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			
				}
			}
			
		System.out.println(min);
			
		
		
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		
			}
		}
		
	System.out.println(max);
		
	}
	}


