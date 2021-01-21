package edu.cnm.deepdive;

public class ContinueStatement {

  public static void main(String[] args) {
    String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

    for (String animal : animals) {
      System.out.println(animal);
    }

    MY_LOOP: for (String animal : animals) {
      if (animal.equals("Lizard")) {
        continue MY_LOOP;//label MY_LOOP is optional.
      }
      System.out.println(animal);//will print all the animals except of Lizard because 'continue'
      //means that we go back to the for loop without printing out 'Lizard'.
    }

//    int index = 0;
//    while (index < animals.length) {
//      String animal = animals[index];
//
//      if (animal.equals("Lizard")) {
//        continue;
//      }
//      System.out.println(animal);//infinite loop.
//      index++;// we increment after the continue; so at 'Lizard' we go back to the while loop without
//      //incrementing index.
//    }

    //to fix: put the increment right after the while statement.
    int index2 = 0;
    while (index2 < animals.length) {
      String animal = animals[index2];
      index2++;

      if (animal.equals("Lizard")) {
        continue;
      }
      System.out.println(animal);
    }
  }
}
