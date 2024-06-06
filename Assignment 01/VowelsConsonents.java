class  VowelsConsonents{
	
  public static void main(String[] agrs){
	  
	  char[]x=new char[10];
	
	x[0]='l';
	x[1]='b';
	x[2]='c';
	x[3]='d';
	x[4]='k';
	x[5]='f';
	x[6]='h';
	x[7]='p';
	x[8]='o';
	x[9]='u';
	
	int vowel_counter=0;
	int consonent_counter=0;
	int i=0;
	int j=0;
	
	
	
	System.out.println("\nVowels are :");
	 
		
		
		while(i<10)
		{
			if(x[i]=='a' || x[i]=='e'|| x[i]=='i' || x[i]=='o'|| x[i]=='u'){
				
				
		
			System.out.println("index "+i+"\t Vowel : "+x[i]);
							
			
			vowel_counter++;
			}
				
			
			i++;
		}
			
			
			System.out.println("\nConsonents are :");
			
			
			
			 while (j<10){
				
			if(x[j]!='a' && x[j]!='e'&& x[j]!='i' && x[j]!='o' && x[j]!='u'){
		
			System.out.println("index "+j+"\t Consonent : "+x[j]);
							
			
			consonent_counter++;
			}
			
			j++;
		}
			
			System.out.println("\nTotal Vowels : "+vowel_counter);
			System.out.println("\nTotal Consonents : "+consonent_counter);
			
			
		}
  }

	