

public class le {


    public static void main(String[] args){
		//int input = 9;
		//boolean decision = true;
		//2,3,4,5,6....12

        int[]x=new int[10];
	
        x[0]=0;
        x[1]=1;
        x[2]=2;
        x[3]=3;
        x[4]=4;
        x[5]=5;
        x[6]=6;
        x[7]=7;
        x[8]=8;
        x[9]=9;
		

        System.out.println("Not Prime Numbers are :: ");

        for(int i = 2; i <= (10-1)/2; i++){
			if(x[i]% 2 == 0){
				//decision = false;
				System.out.println("Not Prime is >>"+x[i]);
				//break;
            }

			}

            System.out.println("Prime Numbers are :: ");



            for(int i = 2; i <= (10-1)/2; i++){
                
                if(x[i]% 2 != 0){
                    //decision = false;
                    System.out.println("Prime is > "+x[i]);
                    //break;
                }
    
                }













		}
		
		
    
}

