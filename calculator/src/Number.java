public abstract class Number {
    private int value;
    private String represent;

    public int getValue(){
        return value;
    }

    public Number(String represent) {
        this.represent = represent;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String valueOf(int n){
        return String.valueOf(n);
    }
}
