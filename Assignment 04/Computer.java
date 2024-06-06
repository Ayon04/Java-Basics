class Computer {
	
	
     private int RamSpeed;
	 private int harddiskCapacity;
	 private double CPUclockSpeed; 
	 private int GPUmemorySize;	 
	 
	
	public void SetRamSpeed(int a){
		 
		 this.RamSpeed=a;
		 
	 }

	public void SetharddiskCapacity(int b){
		 
		 this.harddiskCapacity=b;
		 
	 }
	 
	 
	  
	 public void SetCPUclockSpeed(double c){
		 
		 this.CPUclockSpeed=c;
		 
	 }
	 
	 
	  public double getCPUclockSpeed(){
		 
		 return this.CPUclockSpeed;
		 
	 }
	 
	 
	 
	 
	 public void SetGPUmemorySize(int d){
		 
		 this.GPUmemorySize=d;
		 
	 }
	 
	 
	
	public Computer(){
		
		System.out.println("\nDefoult  constructor for c1 ");
		
	}
	
	
	public Computer(int a,int b, double c,int d){
		
	System.out.println("\nParameterize  constructor for c2 ");
		this.RamSpeed=a;
		this.harddiskCapacity=b;
		this.CPUclockSpeed=c;
		this.GPUmemorySize=d;
		
	}
	
	
	public void showComputerInfo(){
		 
		 
		 System.out.println("Ram Speed : "+this.RamSpeed+" MHz");
		 System.out.println("Hard disk Capacity : "+this.harddiskCapacity+" TB");
		 System.out.println("CPU Clock Speed : "+this.CPUclockSpeed+" GHz");
		 System.out.println("GPU memory Size : "+this.GPUmemorySize+" GB");
		 
	 }
		
		
		
		
		
	}
	 
		
		
	
