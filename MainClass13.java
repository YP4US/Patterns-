class MainClass13
{
	public static void main(String arg[])
	{
		int lines=9;
		int stars=1;
		int mid=(lines+1)/2;

		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=stars;j++)
			{
				if(j==1||j==stars)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
				
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
output:-

*
**
* *
*  *
*   *
*  *
* *
**
*


*/