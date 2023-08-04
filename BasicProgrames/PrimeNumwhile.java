package BasicProgrames;

public class PrimeNumwhile {
  public static void main(String args[])
  {
	  int number=10;
	  int count=0;
	  int i=2;
	  while(i<number)
	  {
		 if(number%i==0)
		 {
			 count++;
			 System.out.println("wo number"+i);
			 
		 }
		 i++;
	  if(count==0)
	  {
		  System.out.println("prime number");
	  }
	  else
	  {
		  System.out.println("not prime");
	  }
  }
}
}