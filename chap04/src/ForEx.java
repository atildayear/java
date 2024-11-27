public class ForEx {
    public static void main(String[] args){
        //초기화 부분에서 두변수를 선언하고 초기화
        int i,sum=0;

        //5번 반복하는 for 문
        for(i=0; i<5; i++){
            sum+=i; //sum에 i를 더해 누적 합계를 구함
            System.out.println("for 루프"+(i+1));
        }
        //루프가 종료된 후, 반복횟수와 누적합계 출력
        System.out.println("for 루프 종료 후 반복 횟수: "+i);
        System.out.println("누적 합계: "+sum);
        //확장된 for 문 사용 예
        int[] numbers = {1,2,3,4,5};
        for( int num : numbers){
            System.out.println("확장 for 루프에서 처리하는 값: "+num);
        }
    }
}
//출력//
//for 루프1
//for 루프2
//for 루프3
//for 루프4
//for 루프5
//for 루프 종료 후 반복 횟수: 5
//누적 합계: 10
//확장 for 루프에서 처리하는 값: 1
//확장 for 루프에서 처리하는 값: 2
//확장 for 루프에서 처리하는 값: 3
//확장 for 루프에서 처리하는 값: 4
//확장 for 루프에서 처리하는 값: 5