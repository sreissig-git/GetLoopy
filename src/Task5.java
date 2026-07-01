//Class Task5
//  main()
//      num start = 1
//      num end = 5
//      num r = start
//      num c = 0
//      for (r = start; r <= end; r = r + 1)
//          for (c = 1; c <= r; c = c + 1)
//              output "* "
//          endfor
//          output newline
//      endfor
//  return
//EndClass
public class Task5
{
	public static void main(String[] args)
    {
		// Print an ascending right triangle from 1 to 5 using nested for-loops.
		double start = 1.0;
		double end = 5.0;
		double r = start;
		double c = 0.0;

		for (r = start; r <= end; r = r + 1.0)
        {
			for (c = 1.0; c <= r; c = c + 1.0)
            {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
