class StudentMain{
	
	public static void main(String args []){
		
		/*StudentAll s1=new StudentAll();
		
		s1.setId(2687);
		s1.setName("Henry");
		s1.setBloodGroup("O+");
		*/
		
		
		
		/*//CollegeStu c1=new CollegeStu();
		    
			// c1.System.out.println("\nCollege ::");
			// c1.setId(1111);
			// c1.setName("Tom");
			// c1.setBloodGroup("A+");
			 c1.setGpa(4.00);
			 */
			 
			// null 
			 
			 
		/*UniversityStu u1=new UniversityStu();

			 //u1.System.out.println("\nUniversity ::");
			 u1.setId(222);
			 u1.setName("Jerry");
			 u1.setBloodGroup("AB+");
			 u1.setCgpa(4.90);
	 */
	 
	 
	 StudentAll s0=new StudentAll(1000,"Aninda","O-");//p-1
	 StudentAll s01=new StudentAll(1100,"Antik","O+");//p-2
	 
	 
	 CollegeStu c2=new CollegeStu(2000,"Biswas","AB+",4.76);//p-1
	 CollegeStu c02=new CollegeStu(2200,"Balvia","AB-",4.44);//p-2
	 
	 
	 UniversityStu u2=new UniversityStu(3000,"Clerk","A-",3.89);//p-1
	 UniversityStu u02=new UniversityStu(3300,"Calin","A+",3.24);//p-2
			
		   //s1.CommonInfo();
		   System.out.println("\nCommon info --");
		   s0.CommonInfo();
		   s01.CommonInfo();
		    System.out.println("\nCollge Students info--");
		  
		   //c1.CommonInfo();
		   c2.CommonInfo();
		   c02.CommonInfo();
		  
		   System.out.println("\nUniversity Students info-- ");
		    //u1.CommonInfo();
		    u2.CommonInfo();
			u02.CommonInfo();
			
			
		
		
		
		
	}	
	
}