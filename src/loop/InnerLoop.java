package loop;

public class InnerLoop {

    public static void main(String[] args) {
//        for (int i = 0; i < 2; i++) {
//            System.out.println("외부 for 시작 i:" + i);
//            for (int j = 0; j < 3; j++) {
//                System.out.println("-> 내부 for " + i + "-" + j);
//            }
//            System.out.println("외부 for 종료 i:" + i);
//            System.out.println();
//        }

        for(int i = 0; i < 10; i++){
            System.out.println(i + "번째 i = " + i);
            for(int j = 0; j < 5; j++){
                System.out.println(j+i);
            }
        }
    }
}
