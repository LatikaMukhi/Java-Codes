class Animal { }
interface Carnivore { }
interface Herbivore { }

class Omnivore extends Animal implements Carnivore, Herbivore { }

public class Main {
  public static void main(String[] args) {
    Omnivore omnivore = new Omnivore();
System.out.println("Omnivore object created.");
  }
}
