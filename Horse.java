public class Horse implements Animal[
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Sheep(int legs, String sound, String food, String color){
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    @Override
    public Animal clone{
        return new Sheep(legs, sound, food, color);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Horse says " + sound);
    }

    @Override
    public String getColor(){
        return color;
    }

    public void setName(String color){
        this.color = color;
    }
]