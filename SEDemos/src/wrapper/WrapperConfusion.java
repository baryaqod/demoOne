package wrapper;

/**
 * Interesting confusions created by Wrapper implementation.
 * @author soufrk
 *
 */
public class WrapperConfusion {

	public static void main(String[] args) {
		
		/* Notice how == behaves for Wrappers */
		Integer i = 10;
		Integer j = 10;
		Integer m = 11;
		//Integer l = 10;
		System.out.println(i == j);
		Integer k = new Integer(10);
		i++;
		System.out.println(i == j);
		System.out.println(i == k);
		System.out.println(i == m);

		/* The behaviour is partial here */
		/*Integer a = 126;
		Integer b = 127;
		Integer c = 127;
		Integer d = 128;
		//b = b+1;
		System.out.println(b == c);
		a++;
		System.out.println(a == b);
		b++;
		System.out.println(b == c);*/
		
		/* The behaviour is absolutely not observed here */
		/*Integer w = 129;
		Integer x = 130;
		Integer y = 130;
		Integer z = 131;
		System.out.println(x == y);
		w++;
		System.out.println(w == x);
		y++;
		System.out.println(y == z);*/
		
		/*
		 * Like String-pool, Integer primitive type also pools
		 * some values. 
		 */
		
	}
	
}
