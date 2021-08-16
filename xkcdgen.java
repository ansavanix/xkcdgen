import java.lang.Math;
class xkcdgen {
	public static void main(String[] args) {
		if (args.length <= 0 || args.length > 1) {
		       	System.out.println("Invalid variable amount.");
			System.exit(1);
		}

		int random;
		for(int i = 0; i < Integer.parseInt(args[0]); i++) {
			random = (int) (Math.random() * wordlist.wordarray.length - 1);
			if(i < Integer.parseInt(args[0]) - 1) System.out.print(wordlist.wordarray[random] + " ");
			else System.out.println(wordlist.wordarray[random]);
		}
		System.out.println();
	}
}
