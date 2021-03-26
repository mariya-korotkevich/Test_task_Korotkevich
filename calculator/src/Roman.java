public class Roman extends Number{

    private static final int[] arabicNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final String[] romanNumbers = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public Roman(String represent) {
        super(represent);
        setValue(parseInt(represent));
        }

    private static int parseInt(String roman){

        for (int i = 0; i < romanNumbers.length; i++) {
            if (romanNumbers[i].equals(roman)){
                return arabicNumbers[i];
            }
        }
        throw new RuntimeException();
    }

    public static boolean isRoman(String roman){
        return roman.matches("[IVX]*");
    }

    @Override
    public String valueOf(int number){

        String result = "";

        if (number == 100) { result = "C";}
        else if (number >= 90){
            result += "XC";
            if (100 - 90 != 10){
                result += findInDic(100 - 90);
            }
        }
        else{
            int countFifty = number / 50;
            int remainFifty = number % 50;

            for (int i = 0; i < countFifty; i++) {
                result += "L";
            }

            int countTen = remainFifty / 10;
            int remainTen = remainFifty % 10;

            for (int i = 0; i < countTen; i++) {
                result += findInDic(10);
            }

            if (remainTen != 0){
                result += findInDic(remainTen);
            }
        }
       return result;
    }

    private static String findInDic (int number){
        for (int i = 0; i < arabicNumbers.length; i++) {
            if (arabicNumbers[i] == number){
                return romanNumbers[i];
            }
        }
        throw new RuntimeException();
    }
}
