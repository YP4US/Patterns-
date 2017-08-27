//Name:Yogesh Pawar Date:28/08/2017

class MainClass1
{
	public static void main(String arg[])
	{
		int spaces=4;
		int lines=5;
		int star=1;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces--;
			star++;
		}
	}
}


/*
Output:-

    *
   **
  ***
 ****
*****

*/