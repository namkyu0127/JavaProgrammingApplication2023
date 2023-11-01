package fly;

public interface Flyable {
//    public pokemonster.Flyable(){
//
//    }

    //pokemonster.Pokemon pokemon;

    //void fly();
    default void fly(){
        System.out.println("날아 갑니다!");
    }
}
