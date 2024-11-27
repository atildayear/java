//객체 배열 예제
//ball 클래스 정의
class Ball{
    String name;
    public void setName(String name){this.name = name;} //setter
    // this -> ball이 갖고 있는 이름이라고 구별해서 지정하기위해 쓰임,python의 self와 비슷
    public String getName(){return name;} // getter

}
public class BallArrayDemo {
    public static void main(String [] args){
        //Ball 객체 5개 저장할 수 잇는 배열생성
        //이 시점에서 배열은 Ball 객체를 참조하지만, 모두 null로 초기화됨
        Ball[] balls = new Ball[5];

        //배열의 처음 두 원소에 대해서만 새 Ball 객체를 할당
        for (int i=0; i<2; i++){
            balls[i] = new Ball(); // i번째 Ball객체를 생성하여 배열에 할당
            // balls[i].name = "hello";
            balls[i].setName((i+1) + "번 공");
        }
        // 배열의 모든 원소 출력
        //객체가 생성되지 않은 배열의 원소는 null출력함
        System.out.println("배열의 원소들:");
        for(Ball ball : balls){
            if(ball != null){
                System.out.println(ball); // 객체의 참조값((주소)출력
                System.out.println(ball.getName()); // 각 ball의 name 출력

            }else {
                System.out.println("null"); //객체가 없는 경우 null 출력
            }
        }
    }
}
