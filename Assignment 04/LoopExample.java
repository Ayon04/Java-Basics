class LoopExample{
	public static void main(String[] args){
		
		
		
		int[]x=new int[10];
	

			x[0]=0;
			x[1]=12;
			x[2]=14;
			x[3]=10;
			x[4]=20;
			x[5]=40;
			x[6]=44;
			x[7]=16;
			x[8]=99;
			x[9]=1;		
			
			int i=0;
			int j=0;
		
		while (i<10){
			
			if(x[i]== 0 || x[i]== 1){
				
				System.out.println("index "+i+"\tNot Prime :"+x[i]);
				
			}
			
			i++;
		}
		
		while(j<10){
			
				if (x[j]%2==0){
				
				System.out.println("index "+j+"\tNot Prime :"+x[j]);
				
			    }
			
			}
			
			j++;
			
		}
		
       } 
		
	
