//Class Task3
//  main()
//      num start = 0
//      num end = 18
//      num i = start
//      for (i = start; i <= end; i = i + 3)
//          output i
//      endfor
//  return
//EndClass
public class Task3 {
	public static void main(String[] args) {
		// Count up from 0 to 18 by 3 using a for-loop
		double start = 0.0;
		double end = 18.0;
		double i = start;

		for (i = start; i <= end; i = i + 3) {
			System.out.print((int) i + " ");
		}
	}
}
