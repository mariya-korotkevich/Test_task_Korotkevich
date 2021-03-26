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
        else{
            int countTen = number / 10;
            int remain = number % 10;

            for (int i = 0; i < countTen; i++) {
                result += findInDic(10);
            }

            if (remain != 0){
                result += findInDic(remain);
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
