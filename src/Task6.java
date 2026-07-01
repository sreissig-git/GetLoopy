//Class Task6
//  main()
//      num start = 5
//      num r = start
//      num c = 0
//      for (r = start; r >= 1; r = r - 1)
//          for (c = 1; c <= r; c = c + 1)
//              output "* "
//          endfor
//          output newline
//      endfor
//  return
//EndClass
public class Task6
{
	public static void main(String[] args)
	{
		// Print a descending right triangle from 5 to 1 using nested for-loops.
		double start = 5.0;
		double r = start;
		double c = 0.0;

		for (r = start; r >= 1.0; r = r - 1.0)
		{
			for (c = 1.0; c <= r; c = c + 1.0)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
