public class ScoreWithArray {
    public static void main(String[] args){
        int[]scores = {100,90,50,95,85};

        int sum = 0;

        //for 문 대신
        for(int score: scores){
            sum += score;
        }

        double average = (double) sum/ scores.length;
        System.out.println("평균점수:"+average + ",총점:"+sum);
    }
}
