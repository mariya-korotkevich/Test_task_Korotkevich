public class Arabic extends Number{

    public Arabic(String represent) {
        super(represent);
        setValue(parseInt(represent));
    }

    private static int parseInt(String s){
        int result = Integer.parseInt(s);
        if(result > 10 ){
            throw new RuntimeException();
        }
        return result;
    }
}
