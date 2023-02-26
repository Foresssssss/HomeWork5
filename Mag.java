package HW5;

public class Mag extends Character{
    private int mana;
    Mag(){
        super();
    }
    Mag(int hp,int stamina,String name,int mana){
        super(hp,stamina,name);//тут может быть ошибка
        setMana(mana);
    }

    public void setMana(int mana) {
        if(mana>=0&&mana<=100) {
            this.mana = mana;
        }
    }
    public int getMana() {
        return mana;
    }
    @Override
    public void hello(){
        System.out.println("Магически приветствую");
    }
    public void hit(int mana){
        if(mana>=60){
            System.out.println("Сильное абракадабра!");
        }else{
            System.out.println("Слабое абракадабра))0)");
        }
    }
}