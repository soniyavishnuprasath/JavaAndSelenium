package newprogrammingpattern;

public class LeftTriangleNumber2 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i>=j)
			{
				if(j%2==0)
					System.out.print(i);
				else
					System.out.print(j);	
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
