package tests;

import java.io.IOException;
import java.util.HashSet;

public class PerfectString {

	public static void main(String[] args) throws IOException {
		/*Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		String _input;
		try {
			_input = in.nextLine();
		} catch (Exception e) {
			_input = null;
		}

		res = isImperfectString(_input);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();*/
		System.out.println(isImperfectString("ordinary"));
		System.out.println(isImperfectString("r"));
	}

	static int isImperfectString(String input) {
		if (input == null) {
			return 1;
		}
		int len = input.length();
		if (len == 1) {
			return 0;
		}
		char[] ch = input.toCharArray();
		HashSet<String> pairs = new HashSet<String>(); 
		for (int d = 0; d <= len - 2; d++) {
			for (int i = 0; i <= len -2 -d; i++) {
				boolean b = pairs.add(" " + ch[i] + ch[i+d+1]);
				if(!b){
					return 1;
				} 
			}
			System.out.println(pairs);
			pairs.clear();
		}
		return 0;
	}
	

}
