public class ArrayCreationDemo {
    public static void main(String[] args){
        //방법1:배열 선언과 동시에 초기화
        int[] scoresMethod1 ={100,90,50,95,85};

        //방법2: new 키워드를 사용하여 배열선언과 동시에 초기화
        int[] scoresMethod2 = new int[] {100,90,50,95,85};

        //방법3: 배열 선언 후, 나중에 new 키워드로 배열 생성과 초기화
        int[] scoresMethod3;
        scoresMethod3  = new int[] {100,90,50,95,85};

        //배열 내용 출력해서 확인

        System.out.println("방법 1로 생성한 배열:");
        for (int score : scoresMethod1) {
            System.out.print(score +" ");
        }
        System.out.println();

        System.out.println("방법 2로 생성한 배열:");
        for (int score : scoresMethod2) {
            System.out.print(score +" ");
        }
        System.out.println();
        System.out.println("방법 3로 생성한 배열:");
        for (int score : scoresMethod3) {
            System.out.print(score +" ");
        }
        System.out.println();


    }
}
