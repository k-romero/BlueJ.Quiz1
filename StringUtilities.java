
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String result = "";
        char[] myArray = valueToBeReversed.toCharArray(); 
  
        for (int i = myArray.length-1; i>=0; i--) 
            result += myArray[i];
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int mid = (word.length()/2);
        char resultArray[] = word.toCharArray();
        return resultArray[mid];
    }

    /**
     * @param value | value to have character removed from
     * @param charToRemove | character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String result = "";
        char[] myArray = value.toCharArray();
        for (int i = 0; i < value.length(); i++){
            if (myArray[i] != charToRemove){
                result += myArray[i];
            }
        }
        return result;
    }

    /**
     * @param sentence | String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String result = sentence.substring(sentence.lastIndexOf(" ")+1);;
        return result;
    }
}
