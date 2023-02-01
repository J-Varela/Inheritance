//Abstract class
abstract class Veihcle {
    protected String brand = "Ford"; //Vehichle attribute
    public void honk() { //  Regular Vehichle method
        System.out.println("Tuut, tuut!");
    }
    // Abstract method (does not have a body)
    public abstract void modelName();

}
