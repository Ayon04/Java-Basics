
class Vehicle{
	
	private int topSpeed;
	private int seatsNumber;
	private String color;
	private String brandName;
	private String transmissionMode;
	
	
	 public void SettopSpeed(int topSpeed){
		
		this.topSpeed=topSpeed;
	
	}
	
	public int gettopSpeed(){
		
		
		return this.topSpeed;
	
	}
	
	
	public void seatsNumber(int seatsNumber){
		
		this.seatsNumber=seatsNumber;
	
	}
	
	public void Setcolor(String color){
		
		this.color=color;
	
	}
	
	public void SetbrandName(String brandName ){
		
		this.brandName=brandName;
	
	}
	
	public void SetTransmissionMode(String transmissionMode ){
		
		this.transmissionMode=transmissionMode;
	
	}
	
	
	
	public Vehicle(){
		
		System.out.println("\nDefoult  constructor for V1 \n");
		
	}
	
	
	public Vehicle(int topSpeed,int seatsNumber,String color,String brandName,String transmissionMode){
		
		System.out.println("\nParameterize  constructor for V2 \n");
		this.topSpeed=topSpeed;
		this.seatsNumber=seatsNumber;
		this.color=color;
		this.brandName=brandName;
		this.transmissionMode=transmissionMode;
		
	}
	
	public void showVehicleInfo(){
		
		System.out.println("Top Speed :"+topSpeed+" Km/h");
		System.out.println("Number of Seats :"+seatsNumber);
		System.out.println("Color :"+color);
		System.out.println("Brand Name :"+brandName);
		System.out.println("Transmission Mode: "+transmissionMode);
		
	}
	
	
	
	
}