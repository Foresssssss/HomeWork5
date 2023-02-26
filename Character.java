package HW5;

public class Character {
    private int hp;
    private int stamina;
    private String name;
    private boolean isHungry;
    private boolean wannaSleep;
    private int strength;
    //кострукторы
    Character(){
        name="default";
        hp=100;//не кто ж его не бил пока что
        stamina=100;
    }
    Character(int hp,int stamina,String name){
        setHp(hp);
        setStamina(stamina);
        setName(name);
    }
    //сеттеры геттеры

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setHp(int hp) {
        if (hp<=100&&hp>=0) {
            this.hp = hp;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStamina(int stamina) {
        if(stamina<=100&&stamina>=0) {
            this.stamina = stamina;
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getStamina() {
        return stamina;
    }
    //методы
    public void walk(int stamina){
        if(stamina<=10){
            System.out.println("Недостаточно выносливости");
        }else{
            System.out.println("Происходит ходьба");
        }
    }
    public void eat(){
        System.out.println("Происходит прием пищи");
        isHungry=false;
    }
    public void sleep(){
        System.out.println("Наелся и спит");
        wannaSleep=false;
    }
    public void hello(){
        System.out.println("...");//мы это переопределим!
    }
    public void hit(){//а это перегрузим
        if(strength>=60){
            System.out.println("Сильный удар!");
        }else{
            System.out.println("Слабый удар))0)");
        }
    }
}