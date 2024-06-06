class OddEven{
public static void main(String [] args){
	
	int[]x=new int[10];
	
	x[0]=10;
	x[1]=12;
	x[2]=14;
	x[3]=13;
	x[4]=99;
	x[5]=87;
	x[6]=19;
	x[7]=-17;
	x[8]=33;
	x[9]=-27;
	
	int even_counter=0;
	int odd_counter=0;
	
	
	System.out.println("\nEven Numbers :");
	for(int i=0;i<10;i++){
		
	
		if(x[i]%2==0){
		
			System.out.println("index "+i+"\t Number : "+x[i]);	
			
			even_counter++;
			
		}

			
		
	}
	
		
	System.out.println("\nOdd Numbers :");
	
	for(int j=0;j<10;j++){
		
		if(x[j]%2!=0){
			
			System.out.println("index "+j+"\t Number : "+x[j]);	
			
			odd_counter++;
			
		}
			
		
	}
	
	System.out.println("\nTotal Even numbers : "+even_counter);
	System.out.println("\nTotal Odd numbers : "+odd_counter);
	
	
}


}