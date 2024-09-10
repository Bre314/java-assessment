package org.humanity;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;

//Task 1.1 Create Person Class
// Define the person class along with String name and LocalDate birthDate
public class Person {
    private String name;
    private LocalDate birthDate;
    private boolean isVegetarian;

    public boolean isVegetarian() {
        return isVegetarian;
    }

    // Write a getter and setter method for each property

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    // Task 1.2 Write a new constructor with name and birthDate as arguments

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    //add another constructor for this new property ie a 3 argument constructor (name birthDate, is Vegetarian)

    public Person(String name, LocalDate birthDate, boolean isVegetarian ) {
        this.name = name;
        this.birthDate = birthDate;
        this.isVegetarian = isVegetarian;
    }

    // write two eat() methods one "eat() method should print a message like is eating their favorite food and the other "eat (String favorite food)
    // method should be similar except that is also print the favorite food given as a method argument.
    //both methods should call p1

    public void eat(){
        System.out.println(getName() + " is eating their favorite food.");
    }


    // Refactor the eat food method to throw an "illegalargumentexception" to handle the case above
    // Make an if statement, so if its meat (Chicken or fish) it should throw an error


    public void eat(Food favoriteFood) throws VegetarianException {
        if (isVegetarian && (favoriteFood == Food.CHICKEN || favoriteFood == Food.FISH)){
            throw new VegetarianException(getName() + "is a vegetarian and cannot eat" + favoriteFood);
        }
        System.out.println(getName() + " is eating " + favoriteFood.name().toLowerCase() + ".");
    }

    // add a boolean field called isVegetarian and getter and setter methods for it, include this property to the toString method
    // make p2 a vegetarian by calling this new 3 argument constructor

    // write a getAge method that returns the persons age in whole years
    public int getAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }



    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    //Task 1.3 Write toString() Method
   @Override
   public String toString() {
      return getClass().getSimpleName() + "{name='" + getName() + "',birthDate=" + getBirthDate() + "is Vegetarian = " + isVegetarian();
  }
}





