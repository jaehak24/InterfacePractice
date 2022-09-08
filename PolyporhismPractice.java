public class PolyporhismPractice {
    //다형성이란 간단하게 설명하면
    //큰 객체 안에 작은 객체를 넣는 것!!
    //EX1
    public static void main(String[] args){
        Human h=new Cheolus(); //Human 객체에 Cheolus 객체를 넣음
        //Cheolus는 Human 객체의 하위 객체
        //Cheolus c=new Human(); !!에러
        //반대로 Human 객체는 상위 클래스라 철수 객체가 받을 수 없음
        h.call(); //철수입니다! 출력
        //즉, 객체는 상위 객체이지만 형변환을 함으로써 하위 클래스에서
        //상위 클래스의 메소드를 변경하여 정의 가능
        //h.status();!!에러->반면 status 메소드는 Human 클래스에 없어서 사용 불가능
        //ex2
        Human hr=new Cheolus();
        h.Name("재학"); //human 객체의 Name 메소드가 아닌 Cheolus 메소드의 Name 메소드가 사용됨
        //출력: 내 이름은 철수가 아닌 재학
    }

}


