package interfaces;


interface Animal{
    public void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

public class oops {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
    }
}
