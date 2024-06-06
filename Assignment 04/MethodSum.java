class MethodSum{
	
	public void Addition  (int a,int b){
		
		System.out.println(a+b);
		
	}
	
	
	public void Addition  (int x,int y,int z){
		
		System.out.println(x+y+z);
		
	}
		
	public void Addition  (int i,int j,String name){
		
		System.out.println(i+j+name);
		
	}
	
	
	public static void main(String args []){
		
		MethodSum m=new MethodSum();
		m.Addition(2,3);
		m.Addition(1,2,3);
		m.Addition(10,20," Ayon");
		
		
			
		}
		
		
		
		
		
		
	}
