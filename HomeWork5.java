package HW5;

public class HomeWork5 {
    public static void main(String[] args) {
        Character character=new Character(100,100,"Null_Vladick");
        character.hello();
        character.hit();
        character.setStrength(100);
        character.hit();
        Mag mag=new Mag(50,50,"Инвокер",10);
        mag.hello();
        mag.hit(50);
        Bowman bowman=new Bowman(75,75,"Meet the sniper",true);
        bowman.hello();
        bowman.shot();
        bowman.hit(bowman.isGoodBowman);
        try {
            Tester tester=new Tester();
        } catch (CharacterCreationException e) {
            System.out.println("Все хорошо все хорошо все хорошо");
        }
        try {
            Tester tester1=new Tester(100,100,"Test");
            System.out.println("Ура победа");
        } catch (CharacterCreationException e) {
            System.out.println("Сюда нельзя попасть");
        }
    }
}
