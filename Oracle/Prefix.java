package Oracle;

public class Prefix {
	public static void main(String[] args) {
		int count = 0;
		String[] str = { "0101","1010","111","01010","10111" };
		for (String s : str) {
			if (s.startsWith("10")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
