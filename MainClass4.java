//Name:Yogesh Pawar Date:28/08/2017
class MainClass4
{
	public static void main(String arg[])
	{
		int star=5;
		int spaces=0;
		int lines=5;

		for (int i=1;i<=lines;i++)
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
			star--;
			spaces++;
		}
	}
}

/*
output:-

*****
 ****
  ***
   **
    *

*/