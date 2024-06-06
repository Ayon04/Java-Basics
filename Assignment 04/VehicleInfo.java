class VehicleInfo{
	
	
	private int topSpeed;
	private int seats;
	private String carColor;
	private String brandName;
	private String Mode;
	
	public void setTopSpeed(int x){
		
		this.topSpeed=x;
	}
	
	public int gettopSpeed(){
		
		return this.topSpeed;
		
	}
	
	
	public void setSeats(int y){
		
		this.seats=y;
	}
	
	public void setCarColor(String q){
		
		this.carColor=q;
	}
	
	public void setBrandName(String r){
		
		this.brandName=r;
	}
	
	public void setMode(String t){
		
		this.Mode=t;
	}
	
	public  VehicleInfo(){
		
	}
	
	public  VehicleInfo(int a,int b,String c,String d,String e){
		
		this.topSpeed=a;
		this.seats=b;
		this.carColor=c;
		this.brandName=d;
		this.Mode=e;
		
	}
	
	
	
	public void showCarInfo(){
		
		System.out.println(this.topSpeed);
		System.out.println(this.seats);
		System.out.println(this.carColor);
		System.out.println(this.brandName);
		System.out.println(this.Mode);
		
	}
	
	
	
	
	
}