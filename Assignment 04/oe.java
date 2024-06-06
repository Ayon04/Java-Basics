class LoopExample{
	public static void main(String[] args){
		int input = 13;
		boolean decision = true;
		//2,3,4,5,6....12
		for(int c = 2; c <= (input-1)/2; c++){
			if(input%c == 0){
				decision = false;
				System.out.println("Not Prime");
				break;
			}
		}
		
		if(decision == true)
			System.out.println("Prime");