public class MainProgram {


    public static void main(String[] args){


        Dog dog = new Dog();
        dog.setName("Rax");
        dog.eat();
       dog.sounds();

        Cat cat = new Cat();
        cat.setName("Stormy");
        cat.eat();
      cat.sounds();

      System.out.println("");

      Home home = new Home();
      home.adoptPet(dog);
      home.makeAllSounds();
      home.adoptPet(cat);
      home.makeAllSounds();



    }
}
