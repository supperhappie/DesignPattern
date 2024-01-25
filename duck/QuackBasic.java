package mysample.duck;

public class QuackBasic implements Quack {
    private static QuackBasic instance = new QuackBasic();

    // 2. private 생성자를 정의하여 외부에서 직접 인스턴스를 생성하는 것을 막습니다.
    private QuackBasic() {
        // 생성자의 내용은 필요에 따라 추가할 수 있습니다.
    }

    public static QuackBasic getInstance(){
        return instance;
    }

    public void quack() {
        System.out.println("quack!");
    }
}
