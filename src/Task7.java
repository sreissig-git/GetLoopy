//Class Task7
//  main()
//      num rows = 5
//      num r = 0
//      num c = 0
//      for (r = 1; r <= rows; r = r + 1)
//          for (c = 1; c <= rows; c = c + 1)
//              output "* "
//          endfor
//          output newline
//      endfor
//  return
//EndClass
public class Task7
{
	public static void main(String[] args)
    {
		// Print a single 5x5 square using nested for-loops with no blank lines.
		double rows = 5.0;
		double r = 0.0;
		double c = 0.0;

		for (r = 1.0; r <= rows; r = r + 1.0)
        {
			for (c = 1.0; c <= rows; c = c + 1.0)
            {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
