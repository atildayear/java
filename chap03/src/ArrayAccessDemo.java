public class ArrayAccessDemo {
    public  static void main(String[] args){
        //배열초기화
        int[] scores = {100,90,50,95,85};
        //배열의 첫번째 원소에 접근
        int firstScore = scores[0];
        System.out.println(("첫번째 점수:"+ firstScore));
        //배열의 마지막원소에 접근
        int lastScore = scores[scores.length -1];
        System.out.println(("마지막 점수:"+ lastScore));
        //배열 크기 출력
        System.out.println(("배열크기:"+ scores.length));
        //배열 모든 원소 출력
        System.out.println(("배열 모든 원소:"));
        for (int i =0; i<scores.length; i ++){
            System.out.println("원소"+i+":"+ scores[i]);
        }
    }
}
