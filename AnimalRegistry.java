public class AnimalRegistry{
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry(Sheep sheepPrototype, Cow cowPrototype, Horse horsePrototype){
        this.sheepPrototype = sheepPrototype;
        this.cowPrototype = cowPrototype;
        this.horsePrototype = horsePrototype
    }

    public Animal createSheep(String name){
        Sheep clonedSheep = (Sheep) sheepPrototype.clone();
        clonedSheep.setName(name);
        return clonedSheep;
    }

    public Animal createCow(){
        return cowPrototype.clone();
    }

    public Animal createHorse(String color){
        Horse clonedHorse = (Horse) horsePrototype.clone();
        clonedHorse.setColor(color)
        return clonedHorse;
    }
}