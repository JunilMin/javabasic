package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        }; //행2, 열3
//
//        System.out.println(arr.length); // 행의 개수
//        System.out.println(arr[0].length); // 첫 번째 행의 열의 길이

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();//한 행이 끝나면 라인을 변경한다.
        }

        System.out.println(arr.length);

        String[][] strings = {
                {"A", "b", "c"}, {"D", "E", "F"}
        };
        for(String[] s : strings){
            for(String i : s){
                System.out.println(i);

            }
        }
    }
}
