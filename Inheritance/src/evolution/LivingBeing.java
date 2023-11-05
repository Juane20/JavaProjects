package evolution;

public abstract class LivingBeing {
    protected int eyesQuantity, armsQuantity, legsQuantity;
    protected String environment; //Water, Surface, Space... (?)
    protected boolean isErect;
    public abstract void animalSound();
    public LivingBeing(String environment, int eyesQuantity, int armsQuantity, int legsQuantity, boolean isErect){
        this.environment = environment;
        this.eyesQuantity = eyesQuantity;
        this.armsQuantity = armsQuantity;
        this.legsQuantity = legsQuantity;
        this.isErect = isErect;
    }
    public String toString(){
        return "Living Being General Attributes: \nN° Eyes: " + this.eyesQuantity +
                "\n" + "N° Arms: " + this.armsQuantity + "\n" + "N° Legs: " + this.legsQuantity +
                "\n" + "Environment: " + this.environment + "\n" + "Is erect? " + this.isErect;
    }
}
