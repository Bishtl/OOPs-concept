package Abstraction;

abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
public void walk(){
    System.out.println("Walk on 4 legs");
}
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk in 2 legs");
    }
}

class opps{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
    }
}




