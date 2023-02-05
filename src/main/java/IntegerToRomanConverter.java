public class IntegerToRomanConverter {

   public   String convert(int arabicNumber) {
       StringBuilder result = new StringBuilder();
        for(int i = 0; i < arabicNumber; i++){
            result.append("I");
        }
        return result.toString();
    }

}
