package array;

public class Array1 {

    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        System.out.println("학생1 점수: " + student1);
        System.out.println("학생2 점수: " + student2);
        System.out.println("학생3 점수: " + student3);
        System.out.println("학생4 점수: " + student4);
        System.out.println("학생5 점수: " + student5);

        int[] student = new int[5];
        student[0] = 100;
        student[1] = 100;
        student[2] = 100;
        student[3] = 100;
        student[4] = 100;

        for(int i = 0; i < 5; i++){
            System.out.println("학생" + (i+1) + " 의 점수" + student[i]);
        }
    }
}
