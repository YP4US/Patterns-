//Name:Yogesh Pawar Date:28/08/2017
class MainClass11
{
	public static void main(String arg[])
	{
		int lines=5;
		int stars=1;																							
		int mid=(lines+1)/2;
		int spaces=4;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=spaces;k++)
			{
				System.out.print(" ");
			}

			for(int l=1;l<=stars;l++)
			{
				System.out.print("*");
			}


			System.out.println();
			if(i>=mid)
			{
				stars--;

			}
			else 
			{
				stars++;	
			}
			
		}
	}
}

/*

*
**
***
**
*

*/