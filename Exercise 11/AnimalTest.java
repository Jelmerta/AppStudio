/* 1.d Eagle extends from Bird, which means that the super constructor without arguments will be called, which indeed sets the number of legs to 2.
 *
 * 
 * 
 * 
 * 
 *
 * 1.c
 *
 */

class Animal {

   // Properties of the class...
   public int     numberOfLegs;
   public boolean hasWings;

   // Constructor of the class...
   public Animal() {
      numberOfLegs = 4;
      hasWings = false;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hello");
   }
}

class Bird extends Animal {

   // Properties of the class...
   public boolean canFly;

   // Constructor of the class...
   public Bird() {
      numberOfLegs = 2;
      hasWings = true;
      canFly = true;
   }

   // Methods of the class...
   public void fly() {
      System.out.println("flap flap");
   }
}

class Eagle extends Bird {

   // Properties of the class...
   private int numberOfKills;

   // Constructor of the class...
   Eagle() {
      numberOfKills = 0;
   }

   // Methods of the class...
   public void attack() {
      numberOfKills++;
   }
}

class AnimalTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Animal a = new Animal();
      System.out.println(a.numberOfLegs);
      System.out.println(a.hasWings);
      a.talk();
      //a.fly(); The class animal has no function fly, so it will not compile.

      Bird b = new Bird();
      System.out.println(b.numberOfLegs);
      System.out.println(b.hasWings);
      System.out.println(b.canFly);
      //System.out.println(b.numberOfKills); The class bird has no definition/assignment of numberOfKills, so it will not compile.
      b.talk();
      //b.attack(); The class bird has no function attack, so it will not compile.

      Eagle e = new Eagle();
      //System.out.println(e.numberOfKills); I didn't notice numberOfKills was set to private, but that will also cause it to not compile.
      System.out.println(e.numberOfLegs);
      System.out.println(e.hasWings);
      e.talk();
      e.attack();

	  a = b;
	  a.talk();
	  //a.fly(); a is still an animal, if you want to do this, you will have to cast it to a bird.
   }
}
