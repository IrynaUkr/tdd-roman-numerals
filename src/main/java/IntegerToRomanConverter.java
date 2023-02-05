public class IntegerToRomanConverter {

    public String convert(int arabicNumber) {
        StringBuilder result = new StringBuilder();
        String[] romans = {"IV", "I"};
        int[] arabics = {4, 1};

        for (int i = 0; i < arabics.length; i++) {
           while(arabicNumber >= arabics[i]){
               result.append(romans[i]);
               arabicNumber = arabicNumber - arabics[i];
           }
        }
        return result.toString();
    }

}
