package Practice_Assignment_Phase1;

public class StringToPrimitive {

	public static void main(String[] args) {
		String name = "252";
		int n = Integer.parseInt(name);
		float f = Float.valueOf(name);
		double d = Double.valueOf(name);
		long l = Long.valueOf(name);
		char[] c = name.toCharArray();
		boolean b =Boolean.valueOf(name);
		System.out.println(n);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(c);
		System.out.println(b);
	}
}
	      