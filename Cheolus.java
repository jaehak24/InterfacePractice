public class Cheolus extends Human {
    @Override //Human 클래스의 call 메소드 상속
    public void call() {
        System.out.println("철수입니다!");
    }

    public void Name(String str) {System.out.printf("내 이름은 철수가 아닌 %s",str);}

    public void status() {
        System.out.println("철수의 상태는?");
    }
}
