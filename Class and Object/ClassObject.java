class Pen{
String color;
String type ; // ball pen , gel pen

public void write(){
    System.out.println("The color of Pen "+this.color+" And the type of Pen is "+this.type);
} 

public void Color(){

    System.out.println(this.color);
}

}




public class ClassObject{
   public  static void main(String[] args) {
       
        Pen p1 = new Pen();
        p1.color = "Red";
        p1.type = "ball";
Pen p2 = new Pen();
p2.color = "Yellow";
p2.type = "Gel";

p1.Color();
p2.Color();


p1.write();

    }
}