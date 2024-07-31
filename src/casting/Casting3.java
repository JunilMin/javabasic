package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고 값
        long maxIntOver = 2147483648L; //int 최고 값 + 1(초과)
        // 최고 값을 넘어가면 오버플로우 발생, 다시 최소 값부터 시작

        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue);

        double doubleNumber = 10000;
        int intNumber;
        intNumber = (int) doubleNumber;
        System.out.println(doubleNumber);
    }
}
