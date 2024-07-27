import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> rel=letterCombinations("23");
	}


		public static List<String> letterCombinations(String digits) {
			List<String> listTotal = new ArrayList<String>();

			char[][] map = {
					{'2','a','b','c','0'},
					{'3','d','e','f','0'},
					{'4','g','h','i','0'},
					{'5','j','k','l','0'},
					{'6','m','n','o','0'},
					{'7','p','q','r','s'},
					{'8','t','u','v','0'},
					{'9','w','x','y','z'}
			};

			char[] str = digits.toCharArray();
			int r = 0;
			if(str.length != 0){
				while(r != str.length){
					List<Character> list = new ArrayList<Character>();
					for (int i = 0; i < 8; i++) {
						if(map[i++][0] == str[r]){
							for (int j = 1; j <= 4; j++) {
								list.add(map[i][j]);
							}

							r++;
						}

					}

					listTotal.add(list.toString());
				}
				return listTotal;
			}
			else{
				return null;
			}

		}

}