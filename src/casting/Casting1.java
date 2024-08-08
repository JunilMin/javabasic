package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long 범위가 더 크기 때문에 가능
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double 범위가 더 크기 때문에 가능
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
