package newprogrammingpattern;

public class RightSidePyramidStar {
	public static void main(String[] args) {
		int n=9,mid=(n/2)+1,space=mid-1,star=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
		}
	}

}
