package casting;

public class Casting2 {

  public static void main(String[] args) {
    double doubleValue = 1.5;
    int intValue = 0;
    String a;

    double doubleValue2 = 1;
    int intValue2;
//        intValue2 = doubleValue2;  // 컴파일 오류 발생
    //intValue = doubleValue; //컴파일 오류 발생
    intValue = (int) doubleValue; ///형변환
    System.out.println(intValue);

    float floatN = 1;

    intValue = (int) floatN;
    intValue = 2;
    System.out.println(intValue);

    int intValue3 = 0;
    long longValue = 0;
    longValue = (long) doubleValue;
    System.out.println(longValue);

  }
}
