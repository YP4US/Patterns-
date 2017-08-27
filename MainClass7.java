//Name:Yogesh Pawar Date:28/08/2017
class MainClass7
{
	public static void main(String arg[])
	{
		int lines=9;
		int star=1;
		int mid=(lines+1)/2;
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i>=mid)
			{
				star--;
			}
			else 
			{
				star++;	
			}

			
		}
	}
}

/*
outpt:-

*
**
***
****
*****
****
***
**
*

*/