package Part_09;

public class word_occurance
{	
	    public static void main(String[] args) {
	        // Sample string and word to search
	        String input = "wordwordwordword";
	        String wordToFind = "word";

	        // Method to count occurrences of the word
	        int occurrenceCount = countWordOccurrences(input, wordToFind);
	        
	        // Output the result
	        System.out.println("Number of occurrences of '" + wordToFind + "': " + occurrenceCount);
	    }

	    public static int countWordOccurrences(String input, String wordToFind) {

	        
	        int count = 0;
	        int index = 0;
	        
	        // Iterate through the string to find occurrences
	        while ((index = input.indexOf(wordToFind, index)) != -1) {
	            count++;
	            index += wordToFind.length(); // Move past the last found word
	        }
	        
	        return count;
	    }
	

}
