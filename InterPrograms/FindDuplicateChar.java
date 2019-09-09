package InterPrograms;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateChar {
	public static void main(String[] args) {
		String a="mypapaimissyou";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char[] ch=a.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		Set<Character> set=map.keySet();
		for(Character c:set) {
			if(map.get(c)>1) {
				System.out.println(c+" "+map.get(c));
			}
		}
	}
}
