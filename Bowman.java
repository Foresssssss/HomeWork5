package HW5;

public class Bowman extends Character{
    public boolean isGoodBowman;
    Bowman(){
        super();
    }
    Bowman(int hp,int stamina,String name,boolean isGoodBowman){//тут тоже может быть ошибка
        super(hp, stamina, name);
        this.isGoodBowman=isGoodBowman;
    }
    public void shot(){
        System.out.println("Лучник стреляет");
    }
    @Override
    public void hello(){
        System.out.println("Я тебе щас бошку прострелю");
    }
    public void hit(boolean isGoodBowman){
        if(isGoodBowman){
            System.out.println("Сильный выстрел!");
        }else{
            System.out.println("Слабый выстрел))0)");
        }
    }
}