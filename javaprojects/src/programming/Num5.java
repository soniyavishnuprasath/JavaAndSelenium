package programming;

public class Num5 {
	public static void main(String[] args) {
		int n=5,x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.printf("%4d",x);
				x++;
			}
			System.out.println();
		}
	}

}
