
public class PokemonGame {
    public static void main(String[] args) {
        NoFly noFly = new NoFly();
        Pikachu pikachu = new Pikachu(noFly);
       // pikachu.setFlyable(new NoFly()); // 프로그램 실행 중 동적으로 나는 방식을 변경


        pikachu.performFly();
    }
}



