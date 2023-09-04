
interface Animal { }
interface Carnivore { }
interface Herbivore { }
interface Omnivore extends Carnivore, Herbivore { }

public class Main {
  public static void main(String[] args) {
System.out.println("Interfaces can extend multiple interfaces.");
  }
}
