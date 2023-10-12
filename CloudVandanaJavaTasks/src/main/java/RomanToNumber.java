import java.util.HashMap;

public class RomanToNumber {
	  public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;
	        
	        for (int i = 0; i < s.length(); i++) {
	        	if(i+1 < s.length() && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i)))
	        	{
	        		result -= romanMap.get(s.charAt(i));
	        	}
	        	else
	        	{
	        		result += romanMap.get(s.charAt(i));
	        	}
	    }
        return result;

	  }
}
// Logics Used:
/*Roman numerals are usually written largest to smallest from left to right
 * Need To Consider : 4 will not be written as IIII instead IV, here we are writing small value at left!!
 * Therefore, small value will come before V and X for eg: IV and IX.
 * We have to handle this, if we are getting small value before then we have to subtract,
 * else we have to add it, That's simple the logic is.
 * 
 * let's consider : CMXCVIII
 * now i = C, i+1 = M
 * As C is smaller than M we will subtract from result and the result will be -100
 * Now i = M, i+1 = X;
 * Here M is greater than X thus, we will add 1000 to the result. now result = -100 +1000 = 900;
 * This loop will run until the last value and the result will be updated as per the above logic. * 
 * 
 */
