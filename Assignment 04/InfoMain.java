
class InfoMain{
	
	public static void main(String args[]){
		
		VehicleInfo car1=new VehicleInfo();
		
		car1.setTopSpeed(300);
		car1.setSeats(4);
		car1.setCarColor("yellow");
		car1.setBrandName("BMW");
		car1.setMode("auto");
		
		
		car1.showCarInfo();
		
		car1.gettopSpeed();
		
		VehicleInfo car2=new VehicleInfo(400,6,"black","TATA","manual");
		
		car2.showCarInfo();
		
		car2.gettopSpeed();
		
		
	if(car1.gettopSpeed()>car2.gettopSpeed()){
		
		System.out.println("car1 Speed is high");
		
	}
	
	else{
		System.out.println("car2 Speed is high");
	}

		
		
	
		
	}
	
}