public class InvertedHalfPyramidStarsPattern
{
	public static void invertedHalfPyramidStarsPattern(int n) {
		int i, j;
		for (i = 4; i >= n; i--)
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
		int k = 0;
		invertedHalfPyramidStarsPattern (k);
	}
}

