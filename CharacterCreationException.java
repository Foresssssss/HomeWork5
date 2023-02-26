package HW5;

public class CharacterCreationException extends Exception{
    CharacterCreationException(){
        super();
        System.out.println("Что-то пошло не так:)");
    }
}