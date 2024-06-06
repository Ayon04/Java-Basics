class VehicleMain{
	
	
	public static void main(String args []){
		
		Vehicle v1= new Vehicle();
		
		v1.SettopSpeed(220);
		v1.seatsNumber(6);
		v1.Setcolor("Black");
		v1.SetbrandName("BMW");
		v1.SetTransmissionMode("Auto");
		
		v1.gettopSpeed();
		
		
		v1.showVehicleInfo();
		
		
		Vehicle v2= new Vehicle(250,4,"Red","Toyota","Manual");
		
		v2.showVehicleInfo();
		
		v2.gettopSpeed();
		
		
		
		
		if(v1.gettopSpeed()>v2.gettopSpeed()){
			
			
			System.out.println("\nV1 Top Speed Is High");
			
		}
		
		
		else{
			
		  System.out.println("\nV2 Top Speed Is High");
			
		}
		
	}
	

}
