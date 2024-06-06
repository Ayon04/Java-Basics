class OddArr{
	
	int oddArray(int[] a){
		int d=0;
		int index=0;
		
		
		for(index=0;index<a.length;index++){
			
			if(a[index]%2!=0){
			
			d=d+a[index];
			}
			
		}
		
		
		return d;
		
	}
		
		void FindrArr(int[] b){
			
			
			
			int input=3;
			int p=-1;
			for(int i=0;i<b.length;i++){
				
				
			
			if(b[i]==input){
			
				System.out.println("Found --input was :"+b[i]);
				
				
			}
			
			else {
			
			   System.out.println("Not Found --"+b[i]);
			
				
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}