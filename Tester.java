package HW5;

public class Tester extends Character{
    Tester() throws CharacterCreationException {
        super();
        String test=getName();
        if(test!="Test"){
            throw new CharacterCreationException();
        }
    }
    Tester(int hp,int stamina,String name) throws CharacterCreationException{
        super(hp,stamina,name);
        String test=getName();
        if(test!="Test"){
            throw new CharacterCreationException();
        }
    }
}