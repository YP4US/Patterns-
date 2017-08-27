//Name:Yogesh Pawar Date:28/08/2017
class MainClass10
{
	public static void main(String arg[])
	{
		int lines=6;
		int spaces=0;
		int stars=5;
		int mid=(lines/2);

		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=spaces;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}

			System.out.println();


			if(i>=mid)
			{
				stars=stars+2;
				spaces--;
			}
			else 
			{
			stars=stars-2;
			spaces++;
			
			}

		}
	}
}

/*
output:-

*****
 ***
  *
 ***
*****
*******


*/