class Result {
    /*
     * Complete the 'maximumOccurringCharacter' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts STRING text as parameter.
     */

    public static char maximumOccurringCharacter(String text) {
        //array to keep count
        int[] count = new int[256];
        //char count array from text
        for(int i = 0; i < text.length(); i++)
            count[text.charAt(i)]++;
        //max count
        int max = -1;
        //initialize result
        char result = ' ';

        //count each char
        for (int i = 0; i < text.length(); i++) {
            if (max < count[text.charAt(i)]){
                max = count[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }

}
