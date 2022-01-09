public class HalfPyramidofStarsPattern {
	public static void halfPyramidStarsPattern(int n) {
		int i, j;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j<= i; j++)
			{

				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int k = 5;
		halfPyramidStarsPattern (k);
	}
}