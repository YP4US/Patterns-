//Name:Yogesh Pawar Date:28/08/2017
class MainClass2
{
	public static void main(String arg[])
	{
		int lines=10;
		int star=1;
		int spaces=9;

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
			star=star+2;
			spaces--;

		}
	}
}

/*
Output:-


         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************

*/


