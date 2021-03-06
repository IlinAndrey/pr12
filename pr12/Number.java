package pr12;

public class Number {
    private final String number;
    private String kod;

    public Number(String number) {
        this.number = parseNumber(number);
    }

    public String parseNumber(String number) {
        boolean isPlus = number.charAt(0) == '+';

        kod = number.substring(0, number.length() - 10);

        if (!isPlus) {
            this.kod = "+" + kod;
        }


        number = number.substring(number.length() - 10, number.length());
        return this.kod + number.substring(0, 0)+ "-" + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
    }

    @Override
    public String toString() {
        return "number = " + number;
    }

    public static void main(String[] args) {
        Number number1 = new Number("+10428234311");
        Number number2 = new Number("88005553535");
        System.out.println(number1);
        System.out.println(number2);

    }
}