public class MultiDimensionalArrayDemo {
    public static void main(String[] args){
        //3행 5열의 2차원 배열 선언 및 초기화
        int[][] scores={
                {100,90,50,95,85}, //첫번째 행의 정수배열
                {70,60,82,75,40}, //두번째 행의 정수배열
                {90,80,70,60,50}  // 세번째 행의 정수배열
        };

        //첫번째 행의 첫번째 열에 잇는 정수에 접근
        int firstRowFirstCol =scores[0][0];
        System.out.println("첫 번째 행의 첫 번째 점수:"+ firstRowFirstCol);

        //두 번째 행의 세 번째 열에 잇는 정수에 접근
        int secondRowThirdCol =scores[1][2];
        System.out.println("두 번째 행의 세 번째 점수:"+ secondRowThirdCol);

        //배열 크기 출력
        System.out.println("2차원 배열의 행의 수(배열의크기):"+ scores.length);
        System.out.println("첫번째 행의 열의 수(첫번째 행의 크기):"+ scores[0].length);

        //2차원 배열의 모든 원소를 순회하며 출력
        System.out.println("2차원 배열의 모든 점수:");
        for (int i =0; i<scores.length;i++){ //각 행에 대해 반복
            for (int j= 0; j<scores[i].length; j++){ // 해당 행의 각 열에 대해 반복
                System.out.print(scores[i][j]+" ");
            }
            System.out.println(); //한행을 출력한 후에 줄바꿈
        }
    }
}
//출력결과//
//첫 번째 행의 첫 번째 점수:100
//두 번째 행의 세 번째 점수:82
//        2차원 배열의 행의 수(배열의크기):3
//첫번째 행의 열의 수(첫번째 행의 크기):5
//        2차원 배열의 모든 점수:
//        100 90 50 95 85
//        70 60 82 75 40
//        90 80 70 60 50