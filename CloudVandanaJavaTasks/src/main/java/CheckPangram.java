import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;

public class CheckPangram {
	
	public static boolean isPangram(String sentence)
	{		
		if(sentence.length() < 26) {
			return false;
		}
		Map<Character, Integer> charToIntegerMap = new HashMap<>();
		for(char eachAlphabet: sentence.toCharArray()) {
			if(!charToIntegerMap.containsKey(Character.toUpperCase(eachAlphabet))) {
				charToIntegerMap.put(Character.toUpperCase(eachAlphabet), 1);
			}
			else {
				int count = charToIntegerMap.get(Character.toUpperCase(eachAlphabet));
				count += 1;
				charToIntegerMap.put(Character.toUpperCase(eachAlphabet), count);			
			}
		}

		if(charToIntegerMap.keySet().size()< 26) {
			return false;
		}	
		// In case if the sentence contains special character and thus keySet() makes to 26 keys
		// To handle this scenario we are going for else part.
		else {
			//Creating the set of Alphabets.
			Set<Character> alphabets = new HashSet<>();
			for(char eachAlphabet = 'A'; eachAlphabet <= 'Z'; eachAlphabet++) {
				alphabets.add(eachAlphabet);
			}
			Set<Character> charactersInSentence = new HashSet<>();
			System.out.println("Alphabets :"+ alphabets);
			for(char eachCharacter : charToIntegerMap.keySet()) {
				if(alphabets.contains(Character.toUpperCase(eachCharacter))) {
					charactersInSentence.add(eachCharacter);
				}
			}
			System.out.println(charactersInSentence);
			if(charactersInSentence.size() == 26) {
				return true;
			}
			else {
				System.out.println("Missing Characters :");
				for(char eachCharacter : alphabets) {
					if(!charactersInSentence.contains(eachCharacter)) {
						System.out.print(eachCharacter + " ");
					}
				}
				System.out.println();
				return false;
			}
			
		}
	}
}
