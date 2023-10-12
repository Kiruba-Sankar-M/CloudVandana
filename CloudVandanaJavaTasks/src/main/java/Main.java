
public class Main {
	public static void main(String[] args) {
		ShuffleAnArray.Shuffle();
		String roman = "XIII";
		int res = RomanToNumber.romanToInt(roman);
		System.out.println("Integer Value Of Given Roman Is " + res);
		String pangram = "The quick brown fox jumps over the lazy dog";
		boolean isPangram = CheckPangram.isPangram(pangram);
		if (isPangram) {
		    System.out.println("The Given String Is Pangram");
		} else {
		    System.out.println("The Given String Is Not A Pangram");
		}
	}
}
