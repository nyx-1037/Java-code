import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Main {
	public static void main(String[] args) {
		String words[]={"are","amy","u"};
		int rel=vowelStrings(words,0,2);
		System.out.println(rel);

		int rel2=calPoints(new String[]{"5","2","C","D","+"});
		System.out.println(rel2);
	}

	public static int vowelStrings(String[] words, int left, int right) {
		int rel=0;
		for(int i=left;i <= right;i++){
			char[] str=words[i].toCharArray();
			if(str[0]=='a'||str[0]=='e'||str[0]=='i'||str[0]=='o'||str[0]=='u'){
				if(str[str.length-1]=='a'||str[str.length-1]=='e'||str[str.length-1]=='i'||str[str.length-1]=='o'||str[str.length-1]=='u'){
					rel++;
				}
			}
		}
		return rel;
	}

//	public static int calPoints(String[] operations) {
//		int j=0;
//		List<Integer> count = new ArrayList<>();
//		for(int i=0;i < operations.length;i++){
//			switch (operations[i]){
//				case "+":
//					count.add(count.get(j - 1) +
//							count.get(j++ - 2));
//					break;
//				case "D":
//					count.add(2 * count.get(j++ - 1));
//					break;
//				case "C":
//					count.remove(j-- - 1);
//					break;
//				default:
//					count.add(Integer.parseInt(operations[i])) ;
//					j++;
//					break;
//			}
//		}
//		return count.stream().mapToInt(Integer::intValue).sum();
//
//
//	}

	public static int calPoints(String[] operations) {
		int j=0;
		int[] count = new int[operations.length];
		for(int i=0;i < operations.length;i++){
			switch (operations[i]){
				case "+":
					count[j] = count[j - 1] +
							count[j++ - 2];
					break;
				case "D":
					count[j] = 2 * count[j++ - 1];
					break;
				case "C":
					count[j-- - 1] = 0;
					break;
				default:
					count[j++] = Integer.parseInt(operations[i]) ;
					break;
			}
		}
		int rel=0;
		for (int i = 0; i < count.length; i++) {
			rel+=count[i];
		}
		return rel;


	}
}