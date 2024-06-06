

public class prime {
	
	public static void main(String args []){
		
		int x=10;
		
		
		 for(int i=2; i<x; i++)
        {
            if(x%i == 0)
            {
                count++;
                break;
            }
        }
        
		if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        
		else
        {
            System.out.print("This is not a Prime Number");
        }
		
		
		
		
	}
	
}