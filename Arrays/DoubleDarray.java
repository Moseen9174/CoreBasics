package Arrays;

public class DoubleDarray {
   public static void main(String args)
   {
	   int arr[][] = new int[10][10];
	   for(int i=1;i<10;i++)
	   {
		   for(int j=1;j<10;j++)
		   {
			   arr[i][j]=i*j;
		   }
	   }
   }
}


