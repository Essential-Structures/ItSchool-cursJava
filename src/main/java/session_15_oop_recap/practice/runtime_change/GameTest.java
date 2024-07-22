package session_15_oop_recap.practice.runtime_change;

public class GameTest {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Bow());
        gameCharacter.attack();
    }
}