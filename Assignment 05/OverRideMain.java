class OverRideMain{
	
	public static void main(String agrs []){
		
		
		Students s1 =new Students();
		
		s1.SetId(1111);
		s1.SetName("Ayon/defoult");
		
		Students s2 =new Students();
		
		s2.SetId(2222);
		s2.SetName("Joydev/defoult");
	
		s1.DisplayInfo();
		s2.DisplayInfo();
		
		CollegeStudents c1=new CollegeStudents();
		
		c1.SetId(3333);
		c1.SetName("Yeasin");
		c1.SetGPA(4.5);
		
		CollegeStudents c2=new CollegeStudents();
		
		c2.SetId(4444);
		c2.SetName("Sumon");
		c2.SetGPA(4.8);
		
		c1.DisplayInfo();
		c2.DisplayInfo();
	}
	
	
}