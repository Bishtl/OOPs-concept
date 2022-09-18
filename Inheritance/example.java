package Inheritance;

public class example {
    public static void main(String[] args) {
        
    }
}


class shapes{
   public void area(){
    System.out.println("display areas");
   }
    
    }

class Triangle extends shapes{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
}
}
class Circle extends shapes{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}