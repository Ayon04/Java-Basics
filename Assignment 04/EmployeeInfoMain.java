class EmployeeInfoMain{
	
	public static void main(String args[]){
		
		Employee e1=new Employee();//default-1
		
		e1.setId("E-21555");
		e1.setName("Alex");
		e1.setDateOfBirth("25 May 1990");
		e1.setJoiningDate("01 Jun 2013");
		e1.setBloodGroup("O+");
		e1.setAddress("Hamilton,Ontari,Canada");
		e1.setMonthlySalary(210000);
		
		Employee e2=new Employee("E-22345","Joydev","12 NOvember 1991","05 January 2015","A+","Habra,Kolkata,India",23000);//parameterize
		//parameterize-1
		e1.showEmplyeeInfo();
		e2.showEmplyeeInfo();
		
		
		ITExecutive i1= new ITExecutive();//default-2
		
		i1.setId("E-00012");
		i1.setName("Sakib");
		i1.setDateOfBirth("28 March 1967");
		i1.setJoiningDate("10 may 1990");
		i1.setBloodGroup("AB+");
		i1.setAddress("Khulna,Bangladesh");
		i1.setMonthlySalary(50000);
		i1.setProjectBonus(2500);
		
		ITExecutive i2= new ITExecutive("E-00013","Niloy","27 March 1989","08 May 2011","B+","Kustia,Dhaka",45000,1200);
		//parameterize-2
		
		i1.InfoIT_Executive();//showinfo method
		i2.InfoIT_Executive();
		
		HRManager h1=new HRManager();//default-3
		
		h1.setId("E-00014");
		h1.setName("Sakib");
		h1.setDateOfBirth("04 July1967");
		h1.setJoiningDate("08 November 1990");
		h1.setBloodGroup("A-");
		h1.setAddress("Bagura,Bangladesh");
		h1.setMonthlySalary(89000);
		h1.setKPI(500);
		
		HRManager h2= new HRManager ("E-00015","Ashik","09 May 1988","08 October 2012","B+","Barishal,Bangladesj",85000,1700);
		//parameterize-3
		h1.HR_ManagerInfo();
		h2.HR_ManagerInfo();//showinfo method
		
		MarketAnalyst m1=new MarketAnalyst();
		
		m1.setId("E-00056");//default-4
		m1.setName("Tanvir");
		m1.setDateOfBirth("09 May 1983");
		m1.setJoiningDate("01 October 2020");
		m1.setBloodGroup("B-");
		m1.setAddress("Sylhet,Bnagladesh");
		m1.setMonthlySalary(33000);
		m1.setCommission(1600);
	
		MarketAnalyst m2= new MarketAnalyst("E-00057","Ashik","09 July 1977","04 October 2019","O+","Cumilla,Bangladesh",85000,1700);
		//parameterize -4
		
		m1.MarketAnalystInfo();
		m2.MarketAnalystInfo();
		
		PartTimer p1=new PartTimer();
		
		p1.setId("E-00060");//default-5
		p1.setName("Sadman");
		p1.setDateOfBirth("21 May 1993");
		p1.setJoiningDate("01 November 2016");
		p1.setBloodGroup("B+");
		p1.setAddress("Jessore,Bnagladesh");
		p1.setMonthlySalary(43000);
		
		PartTimer p2=new PartTimer("E-00070","Sudipto","25 NOvember 1985","15 January 2011","O-","Rajshahi",32000);//parameterize);
		//parameterize-5
		p1.PartTimerInfo();
		p2.PartTimerInfo();
	}
	
}