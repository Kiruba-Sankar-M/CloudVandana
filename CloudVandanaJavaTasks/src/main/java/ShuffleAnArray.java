import java.util.Random;
public class ShuffleAnArray {
	
	public static void Shuffle() {
		int[] numArray = {1, 2, 3, 4, 5, 6};
	    shuffleArray(numArray);
	    
	    // Printing the shuffled array
	    System.out.println("Swapped Array :");
	    for (int num : numArray) {
	        System.out.print(num + " ");
	    }
	    System.out.println();
	}

    
    public static void shuffleArray(int[] array) {
        int len = array.length;
        Random random = new Random();

        for (int i = 0; i < len ; i++) {
            // Generate a random index between 0 and i 
            int randomIndex = random.nextInt(len);
            // Swapping
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
