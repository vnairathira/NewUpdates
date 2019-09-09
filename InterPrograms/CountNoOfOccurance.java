package InterPrograms;

import java.util.HashMap;

public class CountNoOfOccurance {
public static void main(String[] args) {
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	String str="aaaathhiraa";
	char ch[]=str.toCharArray();
	for(char c:ch) {
		if(map.containsKey(c)) {
			map.put(c,map.get(c)+1);
		}else {
			map.put(c,1);
		}
	}
	System.out.println(map.get('a'));
	
}
}
